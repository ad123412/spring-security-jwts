package com.ada.jwt.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}
