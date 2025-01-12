package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiply() {
        final Integer multiply = Calculator.multiply(4, 2);

        assertEquals(8, multiply);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivide() {
        final Integer divide = Calculator.divide(10, 5);

        assertEquals(2, divide);
    }   

    @Test
    @DisplayName("throw ArithmeticException when dividing by zero")
    public void testDivideByZero() {
        
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

// Power (Exponentiation)
// Square Root maybe exception for negative numbers (num < 0)
// Modulo Operation
// Factorial
// Percentage