package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryHeapArrayTest {

    @Test
    public void checkIfGivenArrayIsMaxHeap() {
        int arr[] = {90, 15, 10, 7, 12, 2, 7, 3};
        //int arr[] = {9, 15, 10, 7, 12, 11};
        assertTrue("Heap is not detected", new BinaryHeapArray().checkIfGivenArrayIsMaxHeap(arr));
    }
}