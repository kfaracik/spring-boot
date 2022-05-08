package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final DatabaseConnection databaseConnection;

    @Autowired  // Spring boot inject the dependency
    public UserService(DatabaseConnection databaseConnection) {

        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String name) {
        if (validateUserName(name)) {
            databaseConnection.addUserToDatabase(name);
        }
    }

    private boolean validateUserName(String name) {
        return name.matches("^[a-zA-Z]*$");
    }
}
