package com.myprograms.algorithms.sorting;

import java.util.Arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class RadixSort {
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void sort(int[] arr) {

        int max = ArrayUtility.findMaxElement(arr);

        // Do counting sort for every digit. Note that instead of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, exp);
    }
}
