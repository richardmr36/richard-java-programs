package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.heap.MaxIntHeap;
import com.myprograms.algorithms.heap.MinIntHeap;

public class HeapSort {
    public static void sortUsingMinHeap(int[] items) {
        MinIntHeap heap = new MinIntHeap();
        for (int i = 0; i < items.length; i++)
            heap.add(items[i]);

        int index = 0;
        while (!heap.isEmpty())
            items[index++] = heap.poll();
    }

    public static void sortUsingMaxHeap(int[] items) {
        MaxIntHeap heap = new MaxIntHeap();
        for (int i = 0; i < items.length; i++) {
            heap.add(items[i]);
        }

        int index = 0;
        while (!heap.isEmpty())
            items[index++] = heap.poll();
    }
}
