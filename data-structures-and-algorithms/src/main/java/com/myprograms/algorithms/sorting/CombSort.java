package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class CombSort {

    private static final double SHRINK_FACTOR = 1.3;

    public static void sort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean isSorted = false;

        while (!isSorted) {
            gap = findNextGap(gap);
            if(gap <= 1) {
                gap = 1;
                isSorted = true;
            }

            for (int i = 0; i + gap < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtility.swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private static int findNextGap(int gap) {
        return (int)(gap / SHRINK_FACTOR);
    }
}
