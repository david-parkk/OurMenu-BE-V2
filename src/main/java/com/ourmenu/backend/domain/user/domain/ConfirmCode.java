package com.ourmenu.backend.domain.user.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "confirmCode", timeToLive = 5 * 60)
@Builder
public class ConfirmCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String confirmCode;

    public static ConfirmCode of(String email, String confirmCode){
        return ConfirmCode.builder()
                .email(email)
                .confirmCode(confirmCode)
                .build();
    }
}
