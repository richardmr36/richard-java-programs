package com.myprograms.algorithms.searching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchRecursive() {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = BinarySearch.findRecursively(arr, 0, n - 1, x);
        assertEquals("Recursive Binary Search is not working", 3, result);
    }

    @Test
    public void binarySearchIterative() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = BinarySearch.findIteratively(arr, x);
        assertEquals("Iterative Binary Search is not working", 3, result);
    }
}