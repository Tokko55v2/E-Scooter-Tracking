package com.escooter.michael.kroneder.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}
