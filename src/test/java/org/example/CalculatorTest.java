package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(5, 2));
        assertNotEquals(7, calculator.add(5, 1));
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(5, 2));
        assertNotEquals(3, calculator.subtract(5, 1));
    }

    @Test
    void multiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertNotEquals(4, calculator.multiply(5, 1));
    }

    @Test
    void divide() {
            assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void squareRoot(){
        assertEquals(2, calculator.squareRoot(4));
    }

}
