package com.example.taskone;

public class FacebookUser {
    private String userMail;


    private String userCountryCode;
    private long lastUserActiveAt;


    public FacebookUser(String userMail, String userCountryCode,
     long lastUserActiveAt) {
        this.userMail = userMail;
        this.userCountryCode = userCountryCode;
        this.lastUserActiveAt = lastUserActiveAt;
    }

    public String getEmail() {
        return userMail;
    }


    public String getUserCountry() {
        return userCountryCode;
    }


    public long getUserActiveTime() {
        return lastUserActiveAt;
    }

}