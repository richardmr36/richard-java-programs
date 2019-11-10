package com.myprograms.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BucketSortTest {

    @Test
    public void sort() {
        double[] unsorted = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
        double[] sorted = {0.1234, 0.3434, 0.565, 0.656, 0.665, 0.897};
        BucketSort.sort(unsorted);
        assertArrayEquals("Bucket sort is not working", sorted, unsorted, 0.001);
    }
}