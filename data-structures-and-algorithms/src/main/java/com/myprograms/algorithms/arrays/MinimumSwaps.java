package com.myprograms.algorithms.arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class MinimumSwaps {
    public int noOfSwapsToSortFirst_N_Numbers(int[] arr) {
        int noOfSwaps = 0;
        for (int i = 0; i < arr.length; ) {
            if (arr[i] == i + 1) {
                i++;
                continue;
            }

            ArrayUtility.swap(arr, i, arr[i] - 1);
            noOfSwaps++;
        }

        return noOfSwaps;
    }
}
