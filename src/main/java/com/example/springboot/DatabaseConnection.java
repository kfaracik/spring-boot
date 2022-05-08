package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // tag = it will be bean
public class DatabaseConnection {
    @Value("localhost")
    private String host;
    @Value("my_name")
    private String username;
    @Value("my_password")
    private String password;

    public void addUserToDatabase(String name) {
        System.out.println("User '" + name + "' added to DB.");
    }
}
