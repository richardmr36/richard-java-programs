package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumRepeatingNumberTest {

    @Test
    public void findMaxRepeatingNumberWithMaxValueLessThanK() {
        int arr[] = {2, 3, 3, 5, 3, 4, 1, 7};
        int n = arr.length;
        int k = 8;
        assertEquals("Maximum repeating value is wrong", 3,
                new MaximumRepeatingNumber().findMaxRepeatingNumberWithMaxValueLessThanK(arr, k));
    }
}