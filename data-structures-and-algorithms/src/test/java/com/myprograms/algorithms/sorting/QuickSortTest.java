package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        QuickSort.sort(unsorted, 0, unsorted.length - 1);
        assertArrayEquals("Quick sort is not working", sorted, unsorted);
    }
}