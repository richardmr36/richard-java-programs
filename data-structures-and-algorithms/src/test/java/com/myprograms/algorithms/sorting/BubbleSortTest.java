package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void doSort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        BubbleSort.sort(unsorted);
        assertArrayEquals("Bubble sort is not working", sorted, unsorted);
    }

    @Test
    public void sortRecursive() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        BubbleSort.sortRecursive(unsorted, unsorted.length);
        assertArrayEquals("Bubble sort is not working", sorted, unsorted);
    }
}
