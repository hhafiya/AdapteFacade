package com.example.taskone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageSender {

    public void send(String text, User user, String country) {
        String lastActiveTimeFormatted = formatLastActiveTime(
            user.getLastActiveTime());

        if ("My bro".equalsIgnoreCase(text)) {
            System.out.println("Yo bro! Your friend was active at: " 
            + lastActiveTimeFormatted);
        } else {
            System.out.println(
                "Alright, message received. Let’s make it happen!");
        }

        if ("Ukraine".equalsIgnoreCase(country)) {
            System.out.println("Cool, bro! I’m also from "
             + user.getCountryCode() + ".");
            System.out.println("Hit me up anytime at: "
             + user.getEmail());
        } else {
            System.out.println("Bro, you’re from "
             + user.getCountryCode() + "? That’s awesome!");
            System.out.println("Reach out to me at: "
             + user.getEmail());
        }
    }

    private String formatLastActiveTime(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date resultDate = new Date(timestamp * 1000);
        return sdf.format(resultDate);
    }
}
