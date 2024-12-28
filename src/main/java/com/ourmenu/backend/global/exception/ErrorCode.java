package com.ourmenu.backend.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    // 전역
    INTERNAL_SERVER(HttpStatus.INTERNAL_SERVER_ERROR, "G500", "서버 내부에서 에러가 발생하였습니다"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "G400", "잘못된 요청입니다."),
    FORBIDDEN_RESOURCE(HttpStatus.FORBIDDEN, "G403", "접근할 수 없는 리소스입니다"),
    NOT_FOUND_RESOURCE(HttpStatus.NOT_FOUND, "G404", "찾을 수 없는 리소스입니다"),

    // 유저
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "U404", "해당 유저가 존재하지 않습니다."),
    PASSWORD_NOT_MATCH(HttpStatus.UNAUTHORIZED, "U401", "비밀번호가 일치하지 않습니다."),
    DUPLICATE_EMAIL(HttpStatus.CONFLICT, "U409", "이미 존재하는 이메일입니다."),
    NOT_MATCH_TOKEN(HttpStatus.UNAUTHORIZED, "U401", "유저의 토큰값과 일치하지 않습니다.");

    private final HttpStatus httpStatus;

    private final String code;

    private final String message;
}
