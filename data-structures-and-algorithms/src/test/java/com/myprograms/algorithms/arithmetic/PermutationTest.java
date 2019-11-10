package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {

    @Test
    public void testPermutation() {
        assertEquals(20, Permutation.nPr(5,2));
    }
}