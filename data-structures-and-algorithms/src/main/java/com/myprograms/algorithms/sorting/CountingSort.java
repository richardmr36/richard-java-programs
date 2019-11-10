package com.myprograms.algorithms.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        int countArrayLength = 255;
        // The output array that will have sorted arr
        int[] output = new int[n];

        int[] count = new int[countArrayLength];
        Arrays.fill(count, 0);

        // store count of each element
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        for (int i = 1; i < countArrayLength; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now contains sorted elements
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
}
