package com.example.hometraing.controller.response;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class TokenDto {
    private String grantType;
    private String accessToken;
    private Long accessTokenExpiresIn;
    private String refreshToken;
}
