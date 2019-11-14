package com.myprograms.algorithms.selection;

import org.junit.Assert;
import org.junit.Test;

public class QuickSelectTest {

    @Test
    public void testKthLargestSelect() {
        int[] arr = {1, 5, 4, -2, 8};
        int k = 2;
        int expected = 5;
        Assert.assertEquals(expected, QuickSelect.selectKthLargest(arr, k));
    }

    @Test
    public void testKthSmallestSelect() {
        int[] arr = {1, 5, 4, -2, 8};
        int k = 2;
        int expected = 1;
        Assert.assertEquals(expected, QuickSelect.selectKthSmallest(arr, k));
    }
}