package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

    @Test
    public void findMissingNumber() {
        int[] arr = {2, 1, 7, 8, 5, 3, 4, 9};
        int missing = 6;
        assertEquals("Cannot find missing number", missing, MissingNumber.findMissingNumber(arr));
    }

    @Test
    public void findMissingNumberUsingXOR() {
        int[] arr = {2, 1, 7, 8, 5, 3, 4, 9};
        int missing = 6;
        assertEquals("Cannot find missing number", missing, MissingNumber.findMissingNumberUsingXOR(arr));
    }

    @Test
    public void findTwoMissingNumbers() {
        int[] arr = {2, 1, 7, 8, 5, 4, 9};
        int[] missing = {3, 6};
        assertArrayEquals("Cannot find missing number", missing, MissingNumber.findTwoMissingNumbers(arr));
    }
}