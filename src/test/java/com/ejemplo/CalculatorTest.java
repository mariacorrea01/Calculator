package com.ejemplo;

import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5.0, calc.sum(2, 3), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calc.subtract(3, 2), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calc.divide(6, 3), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calc.multiply(2, 3), 0.0001);
    }
}
