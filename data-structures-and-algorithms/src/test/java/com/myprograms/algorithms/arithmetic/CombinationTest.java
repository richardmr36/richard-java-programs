package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombinationTest {

    @Test
    public void testCombination() {
        assertEquals(10, Combination.nCr(5,3));
        System.out.println(Combination.nCr(9,1) + Combination.nCr(9,2));
    }
}