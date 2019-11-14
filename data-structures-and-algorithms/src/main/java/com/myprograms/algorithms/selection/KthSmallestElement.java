package com.myprograms.algorithms.selection;

import com.myprograms.algorithms.heap.Heap;
import com.myprograms.algorithms.heap.MinIntHeap;
import com.myprograms.algorithms.sorting.MergeSort;

public class KthSmallestElement {
    public static int findUsingSort(int[] arr, int k) {
        MergeSort.mergeSort(arr);
        return arr[k - 1];
    }

    public static int findUsingMinHeap(int[] arr, int k) {
        Heap heap = new MinIntHeap();
        for (int a : arr)
            heap.add(a);

        while (k-- > 1)
            heap.poll();

        return heap.poll();
    }
}
