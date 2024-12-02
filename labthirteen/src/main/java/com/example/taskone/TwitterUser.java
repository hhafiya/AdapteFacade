package com.example.taskone;

public class TwitterUser {
    private String userMail;


    private String countryCode;
    private long lastActiveAt;


    public TwitterUser(
        String userMail, String countryCode, long lastActiveAt) {
        this.userMail = userMail;
        this.countryCode = countryCode;
        this.lastActiveAt = lastActiveAt;
    }

    public String getUserEmail() {
        return userMail;
    }


    public String getCountry() {
        return countryCode;
    }


    public long getLastActiveTime() {
        return lastActiveAt;
    }

}
