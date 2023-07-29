package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testAdd() {

        //Given

        Calculator calculator = new Calculator();

        //When

        final int a = 3;
        final int b = 5;

        final int result = calculator.add(a, b);

        // Then

        final int expected = a + b;
        assertEquals(expected, result);

    }

    @Test
    public void testSubtract() {

        //Given

        Calculator calculator = new Calculator();

        CalcExtra ce = mock(CalcExtra.class);
        when(ce.add(anyInt(), anyInt())).thenReturn(4);


        //When

        final int result = calculator.subtract(ce, 9, 5);

        // Then

        final int expected = 4;
        assertEquals(expected, result);

    }

    @Test
    public void testMultiply() {

        //Given

        Calculator calculator = new Calculator();

        CalcExtra ce = mock(CalcExtra.class);
        when(ce.add(anyInt(), anyInt())).thenReturn(8);


        //When

        final int result = calculator.multiply(ce, 2, 4);

        // Then

        final int expected = 8;
        assertEquals(expected, result);

    }

    @Test
    public void testSubtractZero() {

        //Given

        Calculator calculator = new Calculator();

        //When & Then

        final int a = 0;
        final int b = 0;

        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(a, b));
    }


}
