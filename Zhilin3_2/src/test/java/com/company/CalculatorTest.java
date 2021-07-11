package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void cTestSum() {
        double sum = calculator.sum(2, 2);
        assertEquals(4, sum);
    }
    @Test
    void cTestSub() {
        double sub = calculator.sub(6, 2);
        assertEquals(4, sub);
    }
    @Test
    void cTestMul() {
        double mul = calculator.mul(6, 2);
        assertEquals(12, mul);
    }
    @Test
    void cTestDiv() {
        double div = calculator.div(6, 2);
        assertEquals(3, div);
    }
    @Test
    void cTestDivZero() {
        try {
            double div = calculator.div(21, 0);
            if (div == calculator.div(1, 0)) {
                throw new  ArithmeticException("Деление на ноль");
            }
        } catch (ArithmeticException e) {
            System.out.print("Деление на ноль");
        }
    }
}