package org.example;

public interface CalcExtra {
    int add(final int a, final int b);
    int subtract(CalcExtra ce, final int a, final int b);
    int multiply(CalcExtra ce, final int a, final int b);
    int divide(final int a, final int b) throws IllegalArgumentException;

}
