package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class BubbleSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    ArrayUtility.swap(arr, j, j+1);
                }
    }

    public static void sortRecursive(int arr[], int n) {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ArrayUtility.swap(arr, i, i+1);
            }
        }

        // Largest element is fixed, recur for remaining array
        sortRecursive(arr, n - 1);
    }
}
