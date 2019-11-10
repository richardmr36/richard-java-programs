package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // Swap the found minimum element with the first element
            ArrayUtility.swap(arr, i, minIndex);
        }
    }
}
