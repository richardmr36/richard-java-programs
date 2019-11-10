package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementTest {

    @Test
    public void findNextGreaterElementUsingLoop() {
        int arr[] = { 11, 13, 21, 3 };
        int result[] = { 13, 21, -1, -1 };
        assertArrayEquals("Next Greater element is not found",result,new NextGreaterElement().findNextGreaterElementUsingLoop(arr));
    }

    @Test
    public void findNextGreaterElementUsingStack() {
        int arr[] = { 11, 13, 21, 3 };
        int result[] = { 13, 21, -1, -1 };
        assertArrayEquals("Next Greater element is not found",result,new NextGreaterElement().findNextGreaterElementUsingStack(arr));
    }
}