package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(24, Factorial.get(4));
    }
}