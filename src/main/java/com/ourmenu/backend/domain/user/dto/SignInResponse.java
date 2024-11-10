package com.ourmenu.backend.domain.user.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class SignInResponse {
    private String grantType;
    private String accessToken;
    private String refreshToken;
    private Instant refreshTokenExpiredAt;
}
