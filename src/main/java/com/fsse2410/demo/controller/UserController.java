package com.fsse2410.demo.controller;

import com.fsse2410.demo.data.dto.response.UserResponseDto;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/me/details")
    public UserResponseDto getMyUserDetails(JwtAuthenticationToken jwtToken) {
        UserResponseDto loginUser = new UserResponseDto(jwtToken);
        return loginUser;
    }
}