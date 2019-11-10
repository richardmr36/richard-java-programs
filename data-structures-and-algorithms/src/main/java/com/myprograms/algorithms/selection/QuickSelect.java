package com.myprograms.algorithms.selection;

import java.util.Random;

import com.myprograms.algorithms.utility.ArrayUtility;

public class QuickSelect {
    private int[] arr;

    public int selectKthLargest(int[] arr, int k) {
        this.arr = arr;
        return selectKthLargest(0, arr.length - 1, k - 1);
    }

    private int selectKthLargest(int firstIndex, int lastIndex, int k) {
        int pivot = findLargestPivotUsingHoaresAlgorithm(firstIndex, lastIndex);
        if (pivot > k)
            return selectKthLargest(firstIndex, pivot - 1, k);
        else if (pivot < k)
            selectKthLargest(pivot + 1, lastIndex, k);
        return arr[k];
    }

    private int findLargestPivotUsingHoaresAlgorithm(int firstIndex, int lastIndex) {
        int pivot = findRandomPivot(firstIndex, lastIndex);
        ArrayUtility.swap(arr, lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; ++i)
            if (arr[i] > arr[lastIndex])
                ArrayUtility.swap(arr, i, firstIndex++);

        ArrayUtility.swap(arr, firstIndex, lastIndex);
        return firstIndex;
    }

    private int findRandomPivot(int firstIndex, int lastIndex) {
        return new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
    }

    public int selectKthSmallest(int[] arr, int k) {
        this.arr = arr;
        return selectKthSmallest(0, arr.length - 1, k - 1);
    }

    private int selectKthSmallest(int firstIndex, int lastIndex, int k) {
        int pivot = findSmallestPivotUsingHoaresAlgorithm(firstIndex, lastIndex);
        if (pivot > k)
            return selectKthSmallest(firstIndex, pivot - 1, k);
        else if (pivot < k)
            return selectKthSmallest(pivot + 1, lastIndex, k);
        return arr[k];
    }

    private int findSmallestPivotUsingHoaresAlgorithm(int firstIndex, int lastIndex) {
        int pivot = findRandomPivot(firstIndex, lastIndex);
        ArrayUtility.swap(arr, lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; ++i)
            if (arr[i] < arr[lastIndex])
                ArrayUtility.swap(arr, i, firstIndex++);

        ArrayUtility.swap(arr, firstIndex, lastIndex);
        return firstIndex;
    }
}
