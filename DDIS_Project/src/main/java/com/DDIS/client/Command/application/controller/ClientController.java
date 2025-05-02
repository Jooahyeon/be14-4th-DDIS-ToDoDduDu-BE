package com.DDIS.client.Command.application.controller;

import com.DDIS.client.Command.application.service.ClientService;
import com.DDIS.client.Command.domain.repository.ClientRepository;
import com.DDIS.client.Command.domain.vo.*;
import com.DDIS.security.config.TokenResponseVO;
import com.DDIS.security.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ClientRepository clientRepository;
    private final JwtUtil jwtUtil;


    // 회원 가입 API
    @PostMapping("/signup")
    public ResponseEntity<SignupResponseVO> signup(@RequestBody SignupRequestVO vo) {
        SignupResponseVO response = clientService.signup(vo);
        return ResponseEntity.ok(response);
    }

    // 회원 Login API
    @PostMapping("/login")
    public ResponseEntity<LoginResponseVO> login(@RequestBody LoginRequestVO vo) {
        LoginResponseVO response = clientService.login(vo);
        return ResponseEntity.ok(response);
    }

    // 회원 ID 중복 체크 API
    @GetMapping("/check-id")
    public ResponseEntity<String> checkClientId(@RequestParam String clientId) {
        boolean exists = clientRepository.findByClientId(clientId).isPresent();
        if (exists) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("이미 존재하는 아이디입니다.");
        } else {
            return ResponseEntity.ok("사용 가능한 아이디입니다.");
        }
    }

    // 회원 정보 수정 API
    @PatchMapping("/update")
    public ResponseEntity<UpdateProfileResponseVO> updateProfile(@RequestBody UpdateProfileRequestVO vo) {
        UpdateProfileResponseVO response = clientService.updateProfile(vo);
        return ResponseEntity.ok(response);
    }

    // 비밀번호 변경 API
    @PostMapping("/reset-password")
    public ResponseEntity<PasswordResetResponseVO> resetPassword(@RequestBody PasswordResetRequestVO vo) {
        PasswordResetResponseVO response = clientService.resetPassword(vo);
        return ResponseEntity.ok(response);
    }

    // ID 찾기 API
    @PostMapping("/find-ID")
    public ResponseEntity<FindIDResponseVO> findID(@RequestBody FindIDRequestVO vo) {
        FindIDResponseVO response = clientService.findID(vo);
        return ResponseEntity.ok(response);
    }

    // 마이 페이지 조회 API
    @GetMapping("/mypage")
    public ResponseEntity<MypageResponseVO> getMyPage(HttpServletRequest request) {
        String header = request.getHeader("Authorization");

        if (header == null || !header.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        String token = header.replace("Bearer ", "");
        Long clientNum = jwtUtil.getClientNum(token);

        MypageResponseVO response = clientService.getMyPage(clientNum);
        return ResponseEntity.ok(response);
    }

    // 로그아웃 API
    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization").replace("Bearer ", "");
        Long clientNum = jwtUtil.getClientNum(token);

        clientService.logout(clientNum); // 🔥 Service 호출

        return ResponseEntity.ok("로그아웃 되었습니다.");
    }

    // 토큰 재발급 API
    @PostMapping("/token/refresh")
    public ResponseEntity<TokenResponseVO> refreshAccessToken(@RequestHeader("Refresh-Token") String refreshToken) {
        TokenResponseVO response = clientService.refreshAccessToken(refreshToken);
        return ResponseEntity.ok(response);
    }




}


