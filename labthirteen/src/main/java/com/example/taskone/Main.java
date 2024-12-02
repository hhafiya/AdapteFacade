package com.example.taskone;

public class Main {
    public static void main(String[] args) {
        TwitterUser twitterUser = new TwitterUser(
            "test@twitter.com",
             "Ukraine",
              System.currentTimeMillis() / 1000);
        FacebookUser facebookUser = new FacebookUser(
            "test@facebook.com",
             "Ukraine",
              System.currentTimeMillis() / 1000);

        User twitterAdapter = new TwitterUserAdapter(
            twitterUser);
        User facebookAdapter = new FacebookUserAdapter(
            facebookUser);

        MessageSender sender = new MessageSender();
        sender.send("Hello, World!",
         twitterAdapter, "Ukraine");
        sender.send("Hello, Facebook!",
         facebookAdapter, "Ukraine");

        sender.send("My bro", twitterAdapter,
         "Ukraine");
    }
}
