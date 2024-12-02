package com.example.tasktwo;

public class DataBaseAdapter {
    private final БазаДаних dataBase;


    public DataBaseAdapter(БазаДаних dataBase) {
        this.dataBase = dataBase;
    }

    public String getUserData() {
        return dataBase.отриматиДаніКористувача();
    }

    public String getStaticData() {
        return dataBase.отриматиСтатистичніДані();
    }
}
