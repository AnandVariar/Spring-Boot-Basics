package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Calc c = new Calc();

        int result = c.divide(10,2);
        int expected = 5;
        assertEquals(expected,result);
    }
}