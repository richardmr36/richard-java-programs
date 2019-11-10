package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CombSortTest {

    @Test
    public void sort() {
        int[] unsorted = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        int[] sorted = {-44, -6, 0, 1, 3, 4, 8, 23, 28, 56};
        CombSort.sort(unsorted);
        assertArrayEquals("Comb sort is not working", sorted, unsorted);
    }
}