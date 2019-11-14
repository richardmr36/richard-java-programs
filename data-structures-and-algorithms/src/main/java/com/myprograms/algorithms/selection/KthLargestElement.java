package com.myprograms.algorithms.selection;

import com.myprograms.algorithms.heap.Heap;
import com.myprograms.algorithms.heap.MaxIntHeap;
import com.myprograms.algorithms.sorting.MergeSort;

public class KthLargestElement {
    public static int findUsingSort(int[] arr, int k) {
        MergeSort.mergeSort(arr);
        return arr[arr.length - k];
    }

    public static int findUsingMaxHeap(int[] arr, int k) {
        Heap heap = new MaxIntHeap();
        for (int a : arr)
            heap.add(a);

        while (k-- > 1)
            heap.poll();

        return heap.poll();
    }
}
