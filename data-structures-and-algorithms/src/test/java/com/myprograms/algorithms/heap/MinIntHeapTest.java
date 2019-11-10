package com.myprograms.algorithms.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinIntHeapTest {

    @Test
    public void getMinHeap() {
        MinIntHeap heap = new MinIntHeap();
        int[] items = {7,8,6,9,10};
        for(int i=0;i<items.length;i++) {
            heap.add(items[i]);
            heap.printItems();
            System.out.println();
        }
    }

}