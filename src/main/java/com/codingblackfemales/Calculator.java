package com.codingblackfemales;

public class Calculator {
    public static Integer add(final int firstInput, final int secondInput) {
        return firstInput + secondInput;
    }

    public static Integer subtract(final int firstInput, final int secondInput) {
        return firstInput - secondInput;
    }

    public static Integer multiply(final int firstInput, final int secondInput) {
        return firstInput * secondInput;
    }

    public static Integer divide(final int firstInput, final int secondInput) {
        if (secondInput == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstInput / secondInput;
    }
}
