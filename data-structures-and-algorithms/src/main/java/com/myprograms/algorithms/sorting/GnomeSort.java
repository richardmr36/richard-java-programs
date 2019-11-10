package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class GnomeSort {
    public static void sort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0)
                index++;

            int previous = index - 1;
            if (arr[index] >= arr[previous])
                index++;
            else
                ArrayUtility.swap(arr, index--, previous);
        }
    }
}
