package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BitwiseOperatorsTest {

    @Test
    public void isPowerOfTwo() {
        int x = 2;
        assertTrue(x + " is a power of 2", BitwiseOperators.isPowerOfTwo(x));
    }

    @Test
    public void swapTwoNumbers() {
        BitwiseOperators.swapTwoNumbers(1984, 2001);
    }

    @Test
    public void isOdd() {
        System.out.println(12345 + 54321);
        assertTrue(BitwiseOperators.isOdd(11));
    }

    @Test
    public void isMultipleOfFour() {
        assertTrue(BitwiseOperators.isMultipleOfFour(24));
    }

    @Test
    public void isMultipleOfThree() {
        assertTrue(BitwiseOperators.isMultipleOfThree(21));
    }
}