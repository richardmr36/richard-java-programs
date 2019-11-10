package com.myprograms.algorithms.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestContiguousSubarrayTest {

    @Test
    public void findMaxSubArraySum() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] result = {4,-1,-2,1,5};
        assertEquals(7, LargestContiguousSubarray.findMaxSubArraySum(arr));
        assertArrayEquals(result, LargestContiguousSubarray.findMaxSubArray(arr));
    }
}