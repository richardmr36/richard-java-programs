package com.myprograms.algorithms.selection;

import com.myprograms.algorithms.selection.KthLargestElement;
import org.junit.Assert;
import org.junit.Test;

public class KthLargestElementTest {

    @Test
    public void testFind() {
        int[] arr = {12, 3, 5, 7, 4, 19, 26};
        int k = 3;
        int expected = 12;
        Assert.assertEquals(expected, KthLargestElement.findUsingSort(arr, k));
        Assert.assertEquals(expected, KthLargestElement.findUsingMaxHeap(arr, k));
    }
}