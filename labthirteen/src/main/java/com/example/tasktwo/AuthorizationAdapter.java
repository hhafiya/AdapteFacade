package com.example.tasktwo;

public class AuthorizationAdapter {
    private Авторизація auth;

    public AuthorizationAdapter(Авторизація авторизація) {
        this.auth = авторизація;
    }
    public boolean authorize(БазаДаних db) {
        return auth.авторизуватися(db);
    }
}
