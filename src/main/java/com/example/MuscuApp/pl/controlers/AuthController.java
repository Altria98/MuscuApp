package com.example.MuscuApp.pl.controlers;

import com.example.MuscuApp.bbl.models.user.LoginForm;
import com.example.MuscuApp.bbl.models.user.UserTokenDTO;
import com.example.MuscuApp.bbl.services.UserService;
import com.example.MuscuApp.dl.entities.User;
import com.example.MuscuApp.il.configs.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<UserTokenDTO> login(@RequestBody LoginForm form) {
        User user = userService.login(form.username(), form.password());
        UserTokenDTO dto = UserTokenDTO.fromEntity(user);
        String token = jwtUtil.generateToken(user);
        dto.setToken(token);
        return ResponseEntity.ok(dto);
    }
}


