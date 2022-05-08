package com.example.springboot.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired      // can be used ony on variables and constructors
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
