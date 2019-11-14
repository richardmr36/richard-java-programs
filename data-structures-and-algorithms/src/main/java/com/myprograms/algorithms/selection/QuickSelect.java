package com.myprograms.algorithms.selection;

import java.util.Random;

import com.myprograms.algorithms.utility.ArrayUtility;

public class QuickSelect {
    public static int selectKthLargest(int[] arr, int k) {
        return selectKthLargest(arr, 0, arr.length - 1, k - 1);
    }

    private static int selectKthLargest(int[] arr, int firstIndex, int lastIndex, int k) {
        int pivot = findLargestPivotUsingHoaresAlgorithm(arr, firstIndex, lastIndex);
        if (pivot > k)
            return selectKthLargest(arr, firstIndex, pivot - 1, k);
        else if (pivot < k)
            selectKthLargest(arr, pivot + 1, lastIndex, k);
        return arr[k];
    }

    private static int findLargestPivotUsingHoaresAlgorithm(int[] arr, int firstIndex, int lastIndex) {
        int pivot = findRandomPivot(firstIndex, lastIndex);
        ArrayUtility.swap(arr, lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; ++i)
            if (arr[i] > arr[lastIndex])
                ArrayUtility.swap(arr, i, firstIndex++);

        ArrayUtility.swap(arr, firstIndex, lastIndex);
        return firstIndex;
    }

    private static int findRandomPivot(int firstIndex, int lastIndex) {
        return new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
    }

    public static int selectKthSmallest(int[] arr, int k) {
        return selectKthSmallest(arr, 0, arr.length - 1, k - 1);
    }

    private static int selectKthSmallest(int[] arr, int firstIndex, int lastIndex, int k) {
        int pivot = findSmallestPivotUsingHoaresAlgorithm(arr, firstIndex, lastIndex);
        if (pivot > k)
            return selectKthSmallest(arr, firstIndex, pivot - 1, k);
        else if (pivot < k)
            return selectKthSmallest(arr, pivot + 1, lastIndex, k);
        return arr[k];
    }

    private static int findSmallestPivotUsingHoaresAlgorithm(int[] arr, int firstIndex, int lastIndex) {
        int pivot = findRandomPivot(firstIndex, lastIndex);
        ArrayUtility.swap(arr, lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; ++i)
            if (arr[i] < arr[lastIndex])
                ArrayUtility.swap(arr, i, firstIndex++);

        ArrayUtility.swap(arr, firstIndex, lastIndex);
        return firstIndex;
    }
}
