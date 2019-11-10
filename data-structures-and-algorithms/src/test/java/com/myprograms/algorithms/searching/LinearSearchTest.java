package com.myprograms.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void find() {
        int[] arr = {2, 3, 5, 6, 8, 9, 12, 13, 14};
        int searchElement = 13;
        int expectedPosition = 7;
        Assert.assertEquals("Linear Search is not working", expectedPosition, LinearSearch.find(arr, searchElement));
    }
}