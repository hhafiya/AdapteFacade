package com.example.taskone;

public class TwitterUserAdapter implements User {
    private final TwitterUser twitterUser;


    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserEmail();
    }

    @Override
    public String getCountryCode() {
        return twitterUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }


}
