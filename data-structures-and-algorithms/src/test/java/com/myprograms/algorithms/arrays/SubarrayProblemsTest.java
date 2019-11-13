package com.myprograms.algorithms.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubarrayProblemsTest {

    @Test
    public void findLengthOfLongestSubarrayDivisibleByK() {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        assertEquals("Length is wrong", 4, new SubarrayProblems().findLengthOfLongestSubarrayDivisibleByK(arr, k));
    }

    @Test
    public void countNoOfSubarraysDivisibleByK() {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 7;
        assertEquals("Count is wrong", 3, new SubarrayProblems().countNoOfSubarraysDivisibleByK(arr, k));
    }

    @Test
    public void findTwoElementsWhoseSumIsTheClosestToZero() {
        int[] arr = {1, 60, -10, 70, -80, 85};
        new SubarrayProblems().findTwoElementsWhoseSumIsTheClosestToZero(arr);
    }

    @Test
    public void findMaxSubArraySum() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] result = {4, -1, -2, 1, 5};
        assertEquals(7, SubarrayProblems.findMaxSubArraySum(arr));
        assertArrayEquals(result, SubarrayProblems.findMaxSubArray(arr));
    }
}