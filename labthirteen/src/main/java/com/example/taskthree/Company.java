package com.example.taskthree;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Company {
    private String name;
    private String description;
    private String logo;

    public Company(
        String name,
        String description,
        String logo) {

        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
