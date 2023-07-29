package org.example;

public class Calculator implements CalcExtra {

    @Override
    public int add(final int a, final int b) {
        return a + b;
    }

    @Override
    public int subtract(CalcExtra ce, final int a, final int b) {
        return a - b;
    }

    @Override
    public int multiply(CalcExtra ce, final int a, final int b) {
        return a * b;
    }

    @Override
    public int divide(final int a, final int b) {

        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }

        return a / b;
    }

}
