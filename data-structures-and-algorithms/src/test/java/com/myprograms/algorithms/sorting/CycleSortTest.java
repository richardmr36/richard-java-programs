package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CycleSortTest {

    @Test
    public void sort() {
        int[] unsorted = {1, 8, 3, 9, 10, 10, 2, 4};
        int[] sorted = {1, 2, 3, 4, 8, 9, 10, 10};
        CycleSort.sort(unsorted);
        assertArrayEquals("Cycle sort is not working", sorted, unsorted);
    }
}