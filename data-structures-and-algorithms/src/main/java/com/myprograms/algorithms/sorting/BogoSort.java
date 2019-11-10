package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class BogoSort {
    public static void sort(int[] arr) {
        while (isNotSorted(arr))
            shuffle(arr);
    }

    private static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            ArrayUtility.swap(arr, i, (int) (Math.random() * i) + 1);
    }

    private static boolean isNotSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return true;

        return false;
    }
}
