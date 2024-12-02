package com.example.tasktwo;

public class Main {
    public static void main(String[] args) {

        БазаДаних база = new БазаДаних();
        DataBaseAdapter adapter = new DataBaseAdapter(база);

        ReportBuilder legacyReport = new ReportBuilder(adapter);

        legacyReport.buildReport();
    }
}