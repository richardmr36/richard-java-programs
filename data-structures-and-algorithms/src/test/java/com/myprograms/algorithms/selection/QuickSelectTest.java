package com.myprograms.algorithms.selection;

import org.junit.Test;

public class QuickSelectTest {

    @Test
    public void select() {
        QuickSelect quickSelect = new QuickSelect();
        int[] arr = {1, 5, 4, -2, 8};
        System.out.println("2nd Largest is  "+ quickSelect.selectKthLargest(arr,2));
        System.out.println("2nd Smallest is  "+ quickSelect.selectKthSmallest(arr,2));
    }
}