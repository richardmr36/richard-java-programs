package com.myprograms.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PigeonHoleSortTest {

    @Test
    public void sort() {
        int[] unsorted = {8, 3, 2, 7, 4, 6, 8};
        int[] sorted = {2, 3, 4, 6, 7, 8, 8};
        PigeonHoleSort.sort(unsorted);
        assertArrayEquals("Pigeon Hole sort is not working", sorted, unsorted);
    }
}