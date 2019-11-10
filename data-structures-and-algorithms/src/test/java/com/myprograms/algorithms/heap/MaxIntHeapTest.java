package com.myprograms.algorithms.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxIntHeapTest {
    @Test
    public void getMaxHeap() {
        MaxIntHeap heap = new MaxIntHeap();
        int[] items = {1,2,3,4,5};
        for(int i=0;i<items.length;i++) {
            heap.add(items[i]);
            heap.printItems();
            System.out.println();
        }
    }
}