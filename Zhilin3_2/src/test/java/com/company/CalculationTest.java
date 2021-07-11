package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    void cTest() {
        Calculation calculation = new Calculation();
        double ArrX[] = calculation.calculation(1, -7, 6);

        assertEquals(1, ArrX[0]);
        assertEquals(6, ArrX[1]);
    }
    @Test
    void cTestOne() {
        Calculation calculation = new Calculation();
        double ArrX[] = calculation.calculation(16, -40, 25);

        assertEquals(1.25, ArrX[0]);
    }
    @Test
    void cTestNull() {
        Calculation calculation = new Calculation();
        double ArrX[] = calculation.calculation(5, 3, 4);

        assertEquals(null, ArrX);
    }
}