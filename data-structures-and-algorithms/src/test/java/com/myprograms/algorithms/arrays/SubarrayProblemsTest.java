package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarrayProblemsTest {

    @Test
    public void findLengthOfLongestSubarrayDivisibleByK() {
        int arr[] = {2, 7, 6, 1, 4, 5};
        int k = 3;
        assertEquals("Length is wrong", 4, new SubarrayProblems().findLengthOfLongestSubarrayDivisibleByK(arr, k));
    }

    @Test
    public void countNoOfSubarraysDivisibleByK() {
        int arr[] = { 4, 5, 0, -2, -3, 1 };
        int k = 7;
        assertEquals("Count is wrong", 3, new SubarrayProblems().countNoOfSubarraysDivisibleByK(arr, k));
    }

    @Test
    public void findTwoElementsWhoseSumIsTheClosestToZero() {
        int arr[] = {1, 60, -10, 70, -80, 85};
        new SubarrayProblems().findTwoElementsWhoseSumIsTheClosestToZero(arr);
    }
}