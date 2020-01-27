package com.myprograms.algorithms.selection;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

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

    public static int findUsingPriorityQueue(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; i++)
            priorityQueue.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        return priorityQueue.peek();
    }
}
