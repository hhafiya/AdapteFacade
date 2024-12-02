package com.example.taskthree;

import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class BrandfetchService {
    private static final String API_KEY = "";

    public static Company getCompanyInfo(String domain) throws IOException {
        URL url = new URL("https://api.brandfetch.io/v1/company/" + domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
        connection.connect();

        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);

        String name = jsonObject.optString("name");
        String description = jsonObject.optString("bio");
        String logo = jsonObject.optString("logo");

        return new Company(name, description, logo);
    }
}
