package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class CocktailShakerSort {
    public static void sort(int[] arr) {
        boolean isSwapped = false;
        int start = 0, end = arr.length;

        do {
            for (int i = 0; i < end - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtility.swap(arr, i, i + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped)
                break;

            isSwapped = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtility.swap(arr, i, i + 1);
                    isSwapped = true;
                }
            }

            start++;
        }
        while (isSwapped);
    }
}
