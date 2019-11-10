package com.myprograms.algorithms.selection;

import com.myprograms.algorithms.heap.MinIntHeap;

public class SecondSmallestElement {
    public int findSecondSmallestElement(int[] arr) {
        int first, second;
        first = second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] > first) {
                second = arr[i];
            }
        }

        return second;
    }

    public int findSecondSmallestElementUsingMinHeap(int[] arr) {
        MinIntHeap heap = new MinIntHeap();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        int smallest = heap.poll();
        int second;
        while (heap.peek() == smallest)
            heap.poll();

        return heap.poll();
    }
}
