package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MulTest {

    @Test
    void multiply() {
        Mul m = new Mul();
        int result = m.multiply(2,3,4);
        int expected = 2;
        assertEquals(result,expected);
    }

    @Test
    void add() {
        Mul ml = new Mul();
        int result = ml.add(2,3,4);
        int expected = 9;
        assertEquals(result,expected);
    }
}