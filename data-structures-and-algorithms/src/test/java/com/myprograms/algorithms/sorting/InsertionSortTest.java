package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        InsertionSort.sort(unsorted);
        assertArrayEquals("Insertion sort is not working", sorted, unsorted);
    }

    @Test
    public void sortRecursive() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        InsertionSort.sortRecursive(unsorted, unsorted.length);
        assertArrayEquals("Insertion sort is not working", sorted, unsorted);
    }
}