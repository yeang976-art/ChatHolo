package com.example.visualchat.common.dto;

import com.example.visualchat.common.exception.ErrorCode;

/** 명확한 설계를 위해 정상 응답 양식과 에러용 응답 양식을 분리 */
public record ApiErrorResponse(String code, ErrorCode errorCode, String message) {

    public static ApiErrorResponse error(ErrorCode errorCode) {
        return new ApiErrorResponse(errorCode.getCode(), errorCode, errorCode.getMessage());
    }

    // 커스텀 응답 메세지용
    public static ApiErrorResponse error(ErrorCode errorCode, String message) {
        return new ApiErrorResponse(errorCode.getCode(), errorCode, message);
    }
}
