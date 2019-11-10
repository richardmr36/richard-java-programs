package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BitwiseOperatorsTest {

    public static BitwiseOperators bitwiseOperators = new BitwiseOperators();

    @Test
    public void isPowerOfTwo() {
        int x = 2;
        assertTrue(x + " is a power of 2", bitwiseOperators.isPowerOfTwo(x));
    }

    @Test
    public void swapTwoNumbers() {
        bitwiseOperators.swapTwoNumbers(1984, 2001);
    }

    @Test
    public void isOdd() {
        System.out.println(12345 + 54321);
        assertTrue(bitwiseOperators.isOdd(11));
    }

    @Test
    public void isMultipleOfFour() {
        assertTrue(bitwiseOperators.isMultipleOfFour(24));
    }

    @Test
    public void isMultipleOfThree() {
        assertTrue(bitwiseOperators.isMultipleOfThree(21));
    }
}