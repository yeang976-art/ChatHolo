package com.example.visualchat.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "ERROR_COMMON_1", "잘못된 입력값"),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "ERROR_COMMON_2", "서버 오류")
    ;

    private final HttpStatus status;
    private final String code;
    private final String message;
}
