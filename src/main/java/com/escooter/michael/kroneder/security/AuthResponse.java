package com.escooter.michael.kroneder.security;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

    public AuthResponse(){}
}
