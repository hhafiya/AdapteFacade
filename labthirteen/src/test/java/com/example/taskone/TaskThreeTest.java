package com.example.taskone;
import com.example.taskthree.CompanyInfoFacade;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TaskThreeTest {

    @Test
    void testMain_throwsIOException() {
        ByteArrayOutputStream errorStreamCaptor = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errorStreamCaptor));

        try {
            CompanyInfoFacade.getCompanyDetails("ucu.edu.ua");
        } catch (IOException e) {
            System.err.println("Failed to fetch company details: " + e.getMessage());
        }

        String expectedErrorMessage = 
        "Failed to fetch company details: Server returned HTTP response code:"
         + "401 for URL: "
         +"https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua";
        assertTrue(errorStreamCaptor.toString().contains(expectedErrorMessage));
    }
}