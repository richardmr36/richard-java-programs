package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void areBothIntegersWithOppositeSigns() {
        assertTrue(BitwiseOperators.areBothIntegersWithOppositeSigns(21, -2));
    }

    @Test
    public void numPlusOne() {
        assertEquals(22, BitwiseOperators.numPlusOne(21));
    }

    @Test
    public void multiplyNumWithThreePointFive() {
        assertEquals(7, BitwiseOperators.multiplyNumWithThreePointFive(2));
    }

    @Test
    public void multiplyNumWithSeven() {
        assertEquals(14, BitwiseOperators.multiplyNumWithSeven(2));
    }

    @Test
    public void multiplyNumWithFifteen() {
        assertEquals(30, BitwiseOperators.multiplyNumWithFifteen(2));
    }

    @Test
    public void multiplyTwoNumbersUsingRussianPeasantMethod() {
        assertEquals(40, BitwiseOperators.multiplyTwoNumbersUsingRussianPeasantMethod(5, 8));
        assertEquals(45, BitwiseOperators.multiplyTwoNumbersUsingRussianPeasantMethod(5, 9));
    }

    @Test
    public void isDivisibleByEight() {
        assertFalse(BitwiseOperators.isDivisibleByEight(21));
        assertTrue(BitwiseOperators.isDivisibleByEight(24));
    }
}