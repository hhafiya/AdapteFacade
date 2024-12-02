package com.example;

import java.io.IOException;

import com.example.taskthree.Company;
import com.example.taskthree.CompanyInfoFacade;

public class Main {
    public static void main(String[] args) {
        try {
            Company company = CompanyInfoFacade.getCompanyDetails("ucu.edu.ua");
            System.out.println(company);
        } catch (IOException e) {
            System.err.println("Failed to fetch company details: " + e.getMessage());
        }
    }
}