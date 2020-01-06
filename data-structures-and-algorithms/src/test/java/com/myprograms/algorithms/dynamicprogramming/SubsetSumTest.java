package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class SubsetSumTest {

    @Test
    public void findFeasibleSubset() {
        int[] arr = {5, 2, 3, 1};
        int sum = 9;
        int[] expected = {1, 3, 5};
        int[] actual = SubsetSum.findFeasibleSubset(arr, sum);
        Assert.assertArrayEquals(expected, actual);
    }
}