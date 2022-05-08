package com.example.springboot.dependencyinjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it means this class is for rest api
public class SampleEndpoint {

    @GetMapping("/user")
    public String getUser() {
        return "Samplename";
    }
}
