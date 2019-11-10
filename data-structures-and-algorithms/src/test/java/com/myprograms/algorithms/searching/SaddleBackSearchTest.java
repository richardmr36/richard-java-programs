package com.myprograms.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class SaddleBackSearchTest {

    private static int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
            {50, 60, 70, 80}
    };

    @Test
    public void findRecursively() {
        int searchElement = 29;
        int[] expectedPosition = {2, 1};
        Assert.assertArrayEquals(expectedPosition, SaddleBackSearch.findRecursively(arr, arr[0].length - 1, 0, searchElement));
    }

    @Test
    public void findIteratively() {
        int searchElement = 29;
        int[] expectedPosition = {2, 1};
        Assert.assertArrayEquals(expectedPosition, SaddleBackSearch.findIteratively(arr, searchElement));
    }
}