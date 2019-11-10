package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class PancakeSort {
    public static void sort(int[] arr) {
        for (int currentSize = arr.length; currentSize > 1; currentSize--) {
            int indexOfMaxElement = ArrayUtility.findIndexOfMaxElement(arr, currentSize);
            if (indexOfMaxElement != currentSize - 1) {
                // To move at the end, first move maximum number to beginning
                flipArray(arr, indexOfMaxElement);

                // Now move the maximum number to end by reversing current array
                flipArray(arr, currentSize -1);
            }
        }
    }

    private static void flipArray(int[] arr, int index) {
        int start = 0;
        while (start < index)
            ArrayUtility.swap(arr, start++, index--);
    }
}
