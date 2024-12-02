package com.example.taskone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAdapterTest {

    private FacebookUser facebookUser;
    private FacebookUserAdapter facebookUserAdapter;
    private TwitterUser twitterUser;
    private TwitterUserAdapter twitterUserAdapter;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser(
            "test_facebook@mail.com",
             "UA",
              1638316800L);
        facebookUserAdapter = new FacebookUserAdapter(facebookUser);
        twitterUser = new TwitterUser(
            "test_twitter@mail.com",
             "US",
              1638316800L);
        twitterUserAdapter = new TwitterUserAdapter(twitterUser);
    }

    @Test
    void testFacebookUserAdapter() {
        assertEquals("test_facebook@mail.com",
         facebookUserAdapter.getEmail());
        assertEquals("UA",
         facebookUserAdapter.getCountryCode());
        assertEquals(1638316800L,
         facebookUserAdapter.getLastActiveTime());
    }

    @Test
    void testTwitterUserAdapter() {
        assertEquals("test_twitter@mail.com",
         twitterUserAdapter.getEmail());
        assertEquals("US",
         twitterUserAdapter.getCountryCode());
        assertEquals(1638316800L,
         twitterUserAdapter.getLastActiveTime());
    }
}