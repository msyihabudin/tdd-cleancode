package com.syhb.cleancode.tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz sut;

    @Before
    public void setup() {
        sut = new FizzBuzz();
    }

    @Test
    public void calculateFizzBuzz_FizzNumber() {
        String result = sut.calculateFizzNumber(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void calculateFizzBuzz_BuzzNumber() {
        String result = sut.calculateFizzNumber(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void calculateFizzBuzz_FizzBuzzNumber() {
        String result = sut.calculateFizzNumber(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void calculateFizzBuzz_NonFizzBuzzNumber() {
        String result = sut.calculateFizzNumber(2);
        assertEquals("2", result);
    }

}
