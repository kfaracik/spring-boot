package com.example.springboot;

import com.example.springboot.TestDriveDevelopment.FizBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FizBuzzTest {

    @Test
    public void shouldProcessSingleNumber() {
        FizBuzz fizBuzz = new FizBuzz();

        assertEquals("1", fizBuzz.process(1));
        assertEquals("2", fizBuzz.process(2));
        assertEquals("Fizz", fizBuzz.process(3));
        assertEquals("4", fizBuzz.process(4));
        assertEquals("Buzz", fizBuzz.process(5));
        assertEquals("Fizz", fizBuzz.process(6));
        assertEquals("Buzz", fizBuzz.process(10));
        assertEquals("Fizz Buzz", fizBuzz.process(15));
        assertEquals("19", fizBuzz.process(19));
    }
}
