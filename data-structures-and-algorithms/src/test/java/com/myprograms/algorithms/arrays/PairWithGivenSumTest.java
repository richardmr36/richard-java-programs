package com.myprograms.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class PairWithGivenSumTest {

    @Test
    public void findPairOfElementsWithGivenSumForSortedArrayUsingLoop() {
        int[] arr = {-8, 1, 4, 6, 10, 45};
        int sum = 16;
        int[] expected = {6, 10};
        Assert.assertArrayEquals(expected, PairWithGivenSum.findPairOfElementsWithGivenSumForSortedArrayUsingLoop(arr, sum));
    }

    @Test
    public void findPairOfElementsWithGivenSumUsingHash() {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int[] expected = {6, 10};
        Assert.assertArrayEquals(expected, PairWithGivenSum.findPairOfElementsWithGivenSumUsingHash(arr, sum));
    }

    @Test
    public void findPairOfElementsWithGivenSumForSortedRotatedArray() {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int[] expected = {6, 10};
        Assert.assertArrayEquals(expected, PairWithGivenSum.findPairOfElementsWithGivenSumForSortedRotatedArray(arr, sum));
    }

    @Test
    public void testFindCountOfDistinctPairs() {
        int[] arr1 = {1, 2, 2, 2, 3, 4, 4, 4};
        int sum = 5;
        int expected = 2;
        Assert.assertEquals(expected, PairWithGivenSum.findCountOfDistinctPairs(arr1, sum));

        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1};
        sum = 2;
        expected = 1;
        Assert.assertEquals(expected, PairWithGivenSum.findCountOfDistinctPairs(arr2, sum));
    }
}