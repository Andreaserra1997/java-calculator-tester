package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @Test
    @DisplayName("Test sum")
    void add() {
        float x = Calculator.add(10,5);
        assertEquals(15, x);
        assertNotEquals(9, x);
    }

    @Test
    @DisplayName("Test subtract")
    void subtract() {
        float x = Calculator.subtract(10,5);
        assertEquals(5, x);
        assertNotEquals(10, x);
    }

    @Test
    @DisplayName("Test divide")
    void divide() {
        float x = Calculator.divide(10,5);
        assertEquals(2, x);
        assertNotEquals(11, x);
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5,0));
    }

    @Test
    @DisplayName("Test multiply")
    void multiply() {
        float x = Calculator.multiply(10, 5);
        assertEquals(50, x);
        assertNotEquals(10, x);
    }
}