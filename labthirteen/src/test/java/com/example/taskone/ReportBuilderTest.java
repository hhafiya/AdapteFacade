package com.example.taskone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tasktwo.DataBaseAdapter;
import com.example.tasktwo.ReportBuilder;
import com.example.tasktwo.БазаДаних;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ReportBuilderTest {

    private ReportBuilder reportBuilder;
    private DataBaseAdapter dataBaseAdapter;
    private БазаДаних базаДаних;

    @BeforeEach
    void setUp() {
        базаДаних = new БазаДаних();
        dataBaseAdapter = new DataBaseAdapter(базаДаних);
        reportBuilder = new ReportBuilder(dataBaseAdapter);
    }

    @Test
    void testBuildReport() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        reportBuilder.buildReport();


        String expectedOutput = "User Data: hello\nStatic Data: hello2\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}