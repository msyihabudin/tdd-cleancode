package com.syhb.cleancode.tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator sut;

    @Before
    public void setup() {
        sut = new Calculator();
    }

    @Test
    public void calculateAddition_positiveNumber() {
        int result = sut.addition(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void calculateAddition_negativeNumber() {
        int result = sut.addition(-2, -5);
        assertEquals(-7, result);
    }

    @Test
    public void calculateAddition_positiveNegativeNumber() {
        int result = sut.addition(5, -3);
        assertEquals(2, result);

    }

    @Test
    public void calculateSubtraction_positiveNumber() {
        int result = sut.subtraction(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void calculateSubtraction_negativeNumber() {
        int result = sut.subtraction(-2, -5);
        assertEquals(3, result);
    }

    @Test
    public void calculateSubtraction_positiveNegativeNumber() {
        int result = sut.subtraction(5, -3);
        assertEquals(8, result);

    }

    @Test
    public void calculateMultiplication_positiveNumber() {
        int result = sut.multiplication(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void calculateMultiplication_negativeNumber() {
        int result = sut.multiplication(-2, -5);
        assertEquals(10, result);
    }

    @Test
    public void calculateMultiplication_positiveNegativeNumber() {
        int result = sut.multiplication(5, -3);
        assertEquals(-15, result);

    }

    @Test
    public void calculateDivision_positiveNumber() {
        int result = sut.division(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void calculateDivision_negativeNumber() {
        int result = sut.division(12, 3);
        assertEquals(4, result);
    }

    @Test
    public void calculateDivision_positiveNegativeNumber() {
        int result = sut.division(15, -3);
        assertEquals(-5, result);

    }

}
