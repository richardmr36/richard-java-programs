package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

public class SubsetSumTest {

    @Test
    public void findFeasibleSubset() {
        int[] arr = {5, 2, 3, 1};
        int sum = 9;
        new SubsetSum().findFeasibleSubset(arr, sum);
    }
}