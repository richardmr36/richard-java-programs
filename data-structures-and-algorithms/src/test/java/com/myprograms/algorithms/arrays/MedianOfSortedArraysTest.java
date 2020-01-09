package com.myprograms.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfSortedArraysTest {

    @Test
    public void median() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        double expectedMedian = 3.5;
        Assert.assertEquals(expectedMedian, MedianOfSortedArrays.median(arr1, arr2), 0.001);
    }
}