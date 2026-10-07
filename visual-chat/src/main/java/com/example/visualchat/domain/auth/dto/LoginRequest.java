package com.example.visualchat.domain.auth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record LoginRequest(
        @NotBlank String identifier,
        @NotBlank
        // 비밀번호는 8자 이상이며 대문자, 소문자, 숫자, 특수문자를 모두 포함해야함
        @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$")
        String password
) {
}
