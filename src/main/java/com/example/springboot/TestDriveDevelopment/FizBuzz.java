package com.example.springboot.TestDriveDevelopment;

public class FizBuzz {

    public String process(int n) {
        String result;

        if (n % 3 == 0 && n % 5 == 0) {
            result = "Fizz Buzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(n);
        }

        return result;
    }
}
