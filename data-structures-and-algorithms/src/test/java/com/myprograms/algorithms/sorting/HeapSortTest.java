package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {

    @Test
    public void sortUsingMinHeap() {
        int[] unsorted = {2, 1, 3, 5, 4};
        int[] sorted = {1, 2, 3, 4, 5};
        HeapSort.sortUsingMinHeap(unsorted);
        assertArrayEquals("Heap sort is not working", sorted, unsorted);
    }

    @Test
    public void sortUsingMaxHeap() {
        int[] unsorted = {2, 1, 3, 5, 4};
        int[] sorted = {5, 4, 3, 2, 1};
        HeapSort.sortUsingMaxHeap(unsorted);
        assertArrayEquals("Heap sort is not working", sorted, unsorted);
    }
}