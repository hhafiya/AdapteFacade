package com.example.tasktwo;

public class Авторизація {

    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
