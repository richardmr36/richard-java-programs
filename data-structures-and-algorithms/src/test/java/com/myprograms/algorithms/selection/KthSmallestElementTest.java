package com.myprograms.algorithms.selection;

import com.myprograms.algorithms.selection.KthSmallestElement;
import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementTest {

    @Test
    public void testFindUsingSort() {
        int[] arr = {12, 3, 5, 7, 4, 19, 26};
        int k = 3;
        int expected = 5;
        Assert.assertEquals(expected, KthSmallestElement.findUsingSort(arr, k));
        Assert.assertEquals(expected, KthSmallestElement.findUsingMinHeap(arr, k));
        Assert.assertEquals(expected, KthSmallestElement.findUsingPriorityQueue(arr, k));
    }
}