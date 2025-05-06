package com.DDIS.shareTodo.Command.application.service;

import com.DDIS.applicant.Command.domain.aggregate.ApplicantEntity;
import com.DDIS.applicant.Command.domain.repository.ApplicantRepository;
import com.DDIS.approve.Command.domain.aggregate.Entity.Approve;
import com.DDIS.approve.Command.domain.repository.ApproveRepository;
import com.DDIS.approve.Command.domain.repository.MemberRepository;
import com.DDIS.chatRoom.Command.application.dto.ChatRoomRequestDTO;
import com.DDIS.chatRoom.Command.application.service.ChatRoomService;
import com.DDIS.chatRoom.Command.domain.aggregate.entity.ChatRoomEntity;
import com.DDIS.chatRoom.Command.domain.aggregate.entity.ChatRoomUserEntity;
import com.DDIS.chatRoom.Command.domain.repository.ChatRoomRepository;
import com.DDIS.chatRoom.Command.domain.repository.ChatRoomUserRepository;
import com.DDIS.client.Command.domain.repository.ClientRepository;
import com.DDIS.client.Command.domain.repository.ClientsRepository;
import com.DDIS.post.Command.domain.aggregate.entity.Post;
import com.DDIS.post.Command.domain.repository.PostRepository;
import com.DDIS.shareTodo.Command.application.dto.*;
import com.DDIS.shareTodo.Command.domain.aggregate.Entity.*;
import com.DDIS.shareTodo.Command.domain.repository.MemberShareTodoRepository;
import com.DDIS.shareTodo.Command.domain.repository.RoomRepository;
import com.DDIS.shareTodo.Command.domain.repository.ShareTodoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final PostRepository postRepository;
    private final MemberRepository memberRepository;
    private final ShareTodoRepository shareTodoRepository;
    private final MemberShareTodoRepository memberShareTodoRepository;
    private final GptService gptService;
    private final ChatRoomRepository chatRoomRepository;
    private final ChatRoomUserRepository chatRoomUserRepository;
    private final ApplicantRepository applicantRepository;
    private final ClientsRepository clientsRepository;
    private final ApproveRepository approveRepository;

    private static final List<String> colorPalette = List.of(
            "#FF6D7F", "#505FD4", "#50D4C6"
    );

    private String pickRandomColor() {
        return colorPalette.get(new Random().nextInt(colorPalette.size()));
    }

    @Override
    public void updateApproveRequiredCount(Long roomNum, Integer count) {
        Rooms room = roomRepository.findById(roomNum)
                .orElseThrow(() -> new IllegalArgumentException("방을 찾을 수 없습니다."));
        room.setApproveRequiredCount(count);
        roomRepository.save(room);
    }
    // 공투방 생성
    @Override
    @Transactional
    public Rooms createRoom(CreateShareRoomDTO roomDTO) {
        String randomColor = pickRandomColor();
        Long postNum = roomDTO.getPostNum();



// 여기서 하나씩 반복


            // 게시글 가져오기
        Post posts = postRepository.findById(postNum)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글 없음"));

        LocalDateTime now = LocalDateTime.now();
        String formattedStartDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime endDate = now.plusDays(posts.getActivityTime());
        String formattedEndDate = endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Clients client = clientsRepository.findById(posts.getClientNum().getClientNum())
                .orElseThrow(() -> new IllegalArgumentException("클라이언트 정보 없음"));

        // 방 생성
        Rooms rooms = Rooms.builder()
                .roomNum(postNum) // postNum을 PK로 사용하는 구조면 그대로
                .memberCount(0) // 일단 0으로 초기화, 아래에서 갱신
                .colorRgb(randomColor)
                .startDate(formattedStartDate)
                .endDate(formattedEndDate)
                .title(posts.getPostTitle())
                .content(posts.getPostContent())
                .isActive(true)
                .approveRequiredCount(0) // 아래에서 갱신
                .build();

        roomRepository.save(rooms);
        Rooms syncedRoom = roomRepository.findById(postNum)
                .orElseThrow(() -> new IllegalArgumentException("해당 방 없음"));
        // 채팅방 생성 및 방장 등록
        ChatRoomEntity chatRoom = createChatRoom(syncedRoom);
        createChatRoomUser(chatRoom, roomDTO.getClientNum());

        // 게시글 작성자를 포함한 지원자 목록 가져오기
        List<ApplicantEntity> applicants = applicantRepository.findByPostNum(postNum);
        int memberCount = 0;

        for (ApplicantEntity applicant : applicants) {
            Clients clients = clientsRepository.findById(applicant.getClientNum())
                    .orElseThrow(() -> new IllegalArgumentException("해당 클라이언트 없음"));


            Members member = Members.builder()
                    .room(syncedRoom)
                    .post(posts)
                    .client(clients)
                    .build();
            memberRepository.save(member);
            memberCount++;
        }

        // 🔹 2. 채팅방 유저들 등록 (공통 Room의 모든 멤버 대상으로)
        List<Members> roomMembers = memberRepository.findByRoom_RoomNum(syncedRoom.getRoomNum());
        for (Members member : roomMembers) {
            ChatRoomUserEntity chatRoomUser = ChatRoomUserEntity.builder()
                    .chatRoom(chatRoom)
                    .clientNum((long) member.getClient().getClientNum())  // 해당 멤버의 사용자 ID
                    .role("회원")
                    .lastMsgNum(null)
                    .build();
            chatRoomUserRepository.save(chatRoomUser);
        }


        // 게시글 작성자도 멤버로 포함 (방장)
        Members leader = Members.builder()
                .room(syncedRoom)
                .post(posts)
                .client(client)
                .build();
        memberRepository.save(leader);
        memberCount++;

        // 인원수 및 승인 필수 인원 업데이트
        syncedRoom.setMemberCount(memberCount);
        syncedRoom.setApproveRequiredCount(Math.max(1, memberCount / 2));
        roomRepository.save(syncedRoom);

        return syncedRoom;
    }


    // ChatRoom 생성
    private ChatRoomEntity  createChatRoom(Rooms rooms) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        ChatRoomEntity chatRoom = new ChatRoomEntity();
        chatRoom.setChatRoomName(rooms.getTitle());
        chatRoom.setChatRoomType("공동"); // 필요시 다른 타입으로 변경 가능
        chatRoom.setRooms(rooms);
        chatRoom.setCreatedTime(now);

        return chatRoomRepository.save(chatRoom); // 저장하고 리턴
    }

    private void createChatRoomUser(ChatRoomEntity chatRoom, Long clientNum) {
        ChatRoomUserEntity chatRoomUser = ChatRoomUserEntity.builder()
                .chatRoom(chatRoom)
                .clientNum(clientNum)
                .role("회원")
                .lastMsgNum(null) // 아직 읽은 메시지 없음
                .build();

        chatRoomUserRepository.save(chatRoomUser);
    }


    @Override
    @Transactional
    public List<ShareTodoResponseDTO> saveShareTodos(List<SaveShareTodoDTO> todoList) {
        if (todoList.isEmpty()) {
            throw new IllegalArgumentException("저장할 Todo가 없습니다.");
        }
        Long roomNum = todoList.get(0).getRoomNum();
        Rooms room = roomRepository.findById(roomNum)
                .orElseThrow(() -> new IllegalArgumentException("방을 찾을 수 없습니다."));

        List<ShareTodo> savedTodos = new ArrayList<>();
        List<ShareTodoResponseDTO> responseList = new ArrayList<>();

        for (SaveShareTodoDTO dto : todoList) {
            ShareTodo shareTodo = ShareTodo.builder()
                    .shareTodoName(dto.getShareTodoName())
                    .rooms(room)
                    .build();
            shareTodoRepository.save(shareTodo);
            savedTodos.add(shareTodo);
            responseList.add(new ShareTodoResponseDTO(shareTodo.getShareTodoNum()));
        }

        assignTodosToMembers(room, savedTodos);

        return responseList;
    }

    @Override
    public Rooms findRoomByRoomNum(Long roomNum) {
        return roomRepository.findById(roomNum)
                .orElseThrow(() -> new IllegalArgumentException("방을 찾을 수 없습니다."));
    }

    @Override
    @Transactional
    public List<MemberShareTodoResponseDTO> generateAndSaveGptTodos(Long roomNum, String topic) {
        Rooms room = findRoomByRoomNum(roomNum);

        // GPT한테 투두 생성
        List<ShareTodo> gptTodos = gptService.generateTodoList(room, topic);

        // 생성한 투두를 저장
        List<ShareTodo> savedTodos = new ArrayList<>();
        for (ShareTodo todo : gptTodos) {
            ShareTodo newTodo = ShareTodo.builder()
                    .shareTodoName(todo.getShareTodoName())
                    .rooms(room)
                    .build();
            shareTodoRepository.save(newTodo);
            savedTodos.add(newTodo);
        }

        List<MemberShareTodo> memberShareTodos = assignTodosToMembers(room, savedTodos);



        return memberShareTodos.stream()
                .map(mst -> MemberShareTodoResponseDTO.builder()
                        .memberShareTodoNum(mst.getMemberShareTodoNum())  // 진짜 저장된 PK
                        .shareTodoNum(mst.getShareTodo().getShareTodoNum())
                        .shareTodoName(mst.getShareTodo().getShareTodoName()).build())
                .toList();
    }

    @Override
    public List<ResponseRoomDTO> getRoomsByClientNum(Long clientNum) {
        return memberRepository.findByClient_ClientNum(clientNum)
                .stream()
                .map(Members::getRoom)       // members에서 room 추출
                .distinct()                  // 중복 제거
                .map(ResponseRoomDTO::from)    // DTO 변환
                .collect(Collectors.toList());
    }

    private List<MemberShareTodo> assignTodosToMembers(Rooms room, List<ShareTodo> shareTodos) {
        List<Members> members = memberRepository.findByRoom_RoomNum(room.getRoomNum());
        List<MemberShareTodo> result = new ArrayList<>();

        for (Members member : members) {
            for (ShareTodo todo : shareTodos) {
                MemberShareTodo memberShareTodo = MemberShareTodo.builder()
                        .memberNum(member)
                        .shareTodo(todo)
                        .build();
                memberShareTodoRepository.save(memberShareTodo);
                result.add(memberShareTodo);
            }
        }
        return result;
    }

    @Override
    public RoomDetailDTO getRoomDataByRoomNum(Long roomNum, Long memberNum) {
        // 1. 투두 목록 조회
        List<ShareTodo> todos = shareTodoRepository.findByRooms_RoomNum(roomNum);
        List<ShareTodoDTO> todoDTOs = todos.stream()
                .map(ShareTodoDTO::new)
                .collect(Collectors.toList());

        // 2. 승인 목록 조회 (아직 내가 처리하지 않은 승인만)
        List<Approve> unapprovedApproves = approveRepository.findUnapprovedByMember(roomNum, memberNum);
        List<ApproveDTO> approveDTOs = unapprovedApproves.stream()
                .map(ApproveDTO::new)
                .collect(Collectors.toList());

        // 3. 리턴
        return new RoomDetailDTO(todoDTOs, approveDTOs);
    }


}

