package com.myprograms.algorithms.searching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterpolationSearchTest {

    @Test
    public void findIteratively() {
        int[] arr = {13, 21, 34, 55, 69, 73, 84, 101};
        int searchElement = 84;
        int expectedPosition = 6;
        int result = InterpolationSearch.findIteratively(arr, searchElement);
        assertEquals("Interpolation Search is not working", expectedPosition, result);
    }

    @Test
    public void findRecursively() {
        int[] arr = {13, 21, 34, 55, 69, 73, 84, 101};
        int searchElement = 84;
        int expectedPosition = 6;
        int result = InterpolationSearch.findRecursively(arr, 0, arr.length - 1, searchElement);
        assertEquals("Interpolation Search is not working", expectedPosition, result);
    }
}