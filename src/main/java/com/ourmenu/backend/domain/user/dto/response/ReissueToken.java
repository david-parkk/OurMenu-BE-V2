package com.ourmenu.backend.domain.user.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ReissueToken {

    @NotBlank
    private String refreshToken;
}
