package com.myprograms.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortedSquaresTest {

    @Test
    public void sortSquaresOfSortedArray() {
        Assert.assertArrayEquals(new int[]{1, 4, 9, 16, 25, 36}, SortedSquares.sortSquaresOfSortedArray(new int[]{-6, -3, -1, 2, 4, 5}));
        Assert.assertArrayEquals(new int[]{1, 9, 36}, SortedSquares.sortSquaresOfSortedArray(new int[]{-6, -3, -1}));
        Assert.assertArrayEquals(new int[]{4, 16, 25}, SortedSquares.sortSquaresOfSortedArray(new int[]{2, 4, 5}));
    }
}