package com.myprograms.algorithms.backtracking;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SubsetSumTest {

    @Test
    public void findSubsetSum() {
        int[] arr = {2, 5, 3, 1};
        int sum = 9;
        int[] expected = {5, 3, 1};
        List<int[]> subsetSumList = SubsetSum.findSubsetSum(arr, sum);
        Assert.assertEquals(1, subsetSumList.size());
        Assert.assertArrayEquals(expected, subsetSumList.get(0));
    }
}