package com.projeto.engenharia.esiv_fatec.dto;

public class AuthResponse {
    private String token;
    private String userName;

    public AuthResponse(String token, String userName) {
        this.token = token;
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public String getUserName() {
        return userName;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
