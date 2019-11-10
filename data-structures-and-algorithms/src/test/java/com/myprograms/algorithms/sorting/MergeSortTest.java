package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void sort1() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(unsorted);
        assertArrayEquals("Merge sort is not working", sorted, unsorted);
    }

    @Test
    public void sort2() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        MergeSort.sort(unsorted, 0, unsorted.length - 1);
        assertArrayEquals("Merge sort is not working", sorted, unsorted);
    }

}