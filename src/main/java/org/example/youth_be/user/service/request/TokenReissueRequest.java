package org.example.youth_be.user.service.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenReissueRequest {
    @Schema(description = "만료된 액세스 토큰")
    private String accessToken;
    @Schema(description = "리프레시 토큰")
    private String refreshToken;
}
