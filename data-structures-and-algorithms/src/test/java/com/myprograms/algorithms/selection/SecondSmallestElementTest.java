package com.myprograms.algorithms.selection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondSmallestElementTest {

    @Test
    public void findSecondSmallestElement() {
        int arr[] = {12, 13, 1, 10, 34, 1};
        assertEquals("Second smallest is not found", 10, new SecondSmallestElement().findSecondSmallestElement(arr));
    }

    @Test
    public void findSecondSmallestElementUsingMinHeap() {
        int arr[] = {12, 13, 1, 10, 34, 1};
        assertEquals("Second smallest is not found", 10, new SecondSmallestElement().findSecondSmallestElementUsingMinHeap(arr));
    }
}