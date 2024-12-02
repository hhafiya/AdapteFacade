package com.example.taskone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    private MessageSender messageSender;
    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testSendMessage_FacebookUser_StandardText() {
        User user = new FacebookUserAdapter(new FacebookUser(
            "test@facebook.com",
         "Ukraine", 1638316800L));

        messageSender.send("Alright", user, "Ukraine");

        String expectedOutput = "Alright, message received. Let’s make it happen!\n" +
                                "Cool, bro! I’m also from Ukraine.\n" +
                                "Hit me up anytime at: test@facebook.com\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testSendMessage_TwitterUser_StandardText() {
        User user = new TwitterUserAdapter(new TwitterUser(
            "test@twitter.com",
         "Ukraine", 1638316800L));

        messageSender.send("Alright", user, "Ukraine");

        String expectedOutput =
         "Alright, message received. Let’s make it happen!\n" +
                                "Cool, bro! I’m also from Ukraine.\n" +
                                "Hit me up anytime at: test@twitter.com\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testSendMessage_FacebookUser_BroText() {
        User user = new FacebookUserAdapter(new FacebookUser(
            "test@facebook.com", "Ukraine",
             1638316800L));

        messageSender.send("My bro", user, "Ukraine");

        String expectedOutput = "Yo bro! Your friend was active at: 02:00\n" +
                                "Cool, bro! I’m also from Ukraine.\n" +
                                "Hit me up anytime at: test@facebook.com\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testSendMessage_TwitterUser_BroText() {
        User user = new TwitterUserAdapter(new TwitterUser(
            "test@twitter.com", "Ukraine",
             1638316800L));

        messageSender.send("My bro", user, "Ukraine");

        String expectedOutput = "Yo bro! Your friend was active at: 02:00\n" +
                                "Cool, bro! I’m also from Ukraine.\n" +
                                "Hit me up anytime at: test@twitter.com\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testSendMessage_International() {
        User user = new TwitterUserAdapter(new TwitterUser(
            "test@twitter.com",
             "US", 1638316800L));

        messageSender.send("Alright", user, "Germany");

        String expectedOutput = "Alright, message received. Let’s make it happen!\n" +
                                "Bro, you’re from US? That’s awesome!\n" +
                                "Reach out to me at: test@twitter.com\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}

