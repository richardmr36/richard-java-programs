package com.myprograms.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BogoSortTest {

    @Test
    public void sort() {
        int[] unsorted = {5, 3, 4, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5};
        BogoSort.sort(unsorted);
        assertArrayEquals("Bogo sort is not working", sorted, unsorted);
    }
}