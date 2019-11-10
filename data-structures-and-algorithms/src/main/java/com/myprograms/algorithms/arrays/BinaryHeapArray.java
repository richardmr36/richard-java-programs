package com.myprograms.algorithms.arrays;

public class BinaryHeapArray {
    public boolean checkIfGivenArrayIsMaxHeap(int[] arr) {
        return checkIfGivenArrayIsMaxHeap(arr, 0, arr.length - 1);
    }

    private boolean checkIfGivenArrayIsMaxHeap(int[] arr, int index, int n) {
        if (index > (n - 2) / 2)
            return true;

        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        if (arr[index] >= arr[leftChildIndex] && arr[index] >= arr[rightChildIndex])
            return checkIfGivenArrayIsMaxHeap(arr, leftChildIndex, n) && checkIfGivenArrayIsMaxHeap(arr, rightChildIndex, n);

        return false;
    }
}
