package com.myprograms.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class TernarySearchTest {

    @Test
    public void findRecursively() {
        int[] arr = {2, 3, 5, 6, 8, 9, 12, 13, 14};
        int searchElement = 13;
        int expectedPosition = 7;

        Assert.assertEquals("Ternary Search is not working", expectedPosition, TernarySearch.findRecursively(arr, 0, arr.length - 1, searchElement));
    }

    @Test
    public void findIteratively() {
        int[] arr = {2, 3, 5, 6, 8, 9, 12, 13, 14};
        int searchElement = 13;
        int expectedPosition = 7;

        Assert.assertEquals("Ternary Search is not working", expectedPosition, TernarySearch.findIteratively(arr, searchElement));
    }
}