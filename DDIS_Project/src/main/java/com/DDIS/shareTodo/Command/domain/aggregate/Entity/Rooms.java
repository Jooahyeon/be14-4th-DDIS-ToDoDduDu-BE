package com.DDIS.shareTodo.Command.domain.aggregate.Entity;

import com.DDIS.chatRoom.Command.domain.aggregate.entity.ChatRoomEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "rooms")
public class Rooms {
    @Id
    @Column(name = "room_num")
    private Long roomNum;

    @Column(name = "member_count")
    private int memberCount;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "color_rgb")
    private String colorRgb;

    @Column(name = "approve_required_count")
    private int approveRequiredCount;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    // ✅ rooms(부모) → chatRoom(자식) 연관관계 설정 추가
    @OneToMany(mappedBy = "rooms", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChatRoomEntity> chatRooms = new ArrayList<>();

}
