package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void findGreatestCommonDivisor() {
        assertEquals(3, GreatestCommonDivisor.findGreatestCommonDivisor(9, 6));
        assertEquals(3, GreatestCommonDivisor.findGcdUsingEuclideanMethod(9, 6));
        assertEquals(3, GreatestCommonDivisor.findGcdUsingEuclideanMethodIterative(9, 6));
        int[] arr = {2, 3, 4, 5};
        assertEquals(1, GreatestCommonDivisor.findGcdOfArray(arr));
    }
}