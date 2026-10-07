package com.example.visualchat.domain.auth.entity;

import com.example.visualchat.domain.user.enums.UserGrade;

public record AuthUser(Long userId, String nickname, String email, UserGrade grade) {
}
