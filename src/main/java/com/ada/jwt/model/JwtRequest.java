package com.ada.jwt.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;

    public JwtRequest(String username, String password) {
        this.setUserName(username);
        this.setPassword(password);
    }
}
