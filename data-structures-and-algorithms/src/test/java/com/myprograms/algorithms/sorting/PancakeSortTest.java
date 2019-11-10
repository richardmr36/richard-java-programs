package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PancakeSortTest {
    @Test
    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        PancakeSort.sort(unsorted);
        assertArrayEquals("Pancake sort is not working", sorted, unsorted);
    }
}
