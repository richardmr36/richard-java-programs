package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void getSubsequenceUsingRecursion() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int[] expected = {10, 22, 33, 50, 60};
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        Assert.assertEquals(5, lis.getSubsequenceUsingRecursion(arr, arr.length));
        Assert.assertArrayEquals(expected, lis.getArray(arr));
    }

    @Test
    public void getSubsequenceUsingDp() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        Assert.assertEquals(5, lis.getSubsequenceUsingDp(arr, arr.length));
    }

    @Test
    public void getSubsequenceUsingMemoization() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        Assert.assertEquals(5, lis.getSubsequenceUsingMemoization(arr, arr.length, new int[arr.length]));
    }
}