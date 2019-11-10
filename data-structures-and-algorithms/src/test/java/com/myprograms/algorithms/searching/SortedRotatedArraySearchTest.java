package com.myprograms.algorithms.searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortedRotatedArraySearchTest {

    @Test
    public void findElementFromSortedRotatedArray() {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int element = 3;
        assertEquals("Element is not found", 8, new SortedRotatedArraySearch().findElementFromSortedRotatedArray(arr, element));
    }

    @Test
    public void findElementWithOnePass() {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int element = 3;
        assertEquals("Element is not found", 8, new SortedRotatedArraySearch().findElementWithOnePass(arr, 0, arr.length - 1, element));
    }

    @Test
    public void findMinimumElement() {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        assertEquals("Element is not found", 1, arr[new SortedRotatedArraySearch().findMinimumElementIndexFromSortedRotatedArray(arr, 0, arr.length - 1)]);
    }
}