package com.myprograms.algorithms.arrays;

import java.util.Arrays;

public class LargestContiguousSubarray {
    public static int findMaxSubArraySum(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }

        return maxSoFar;
    }

    public static int[] findMaxSubArray(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];
        int startIndex = 0, endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            if (currentMax == arr[i])
                startIndex = i;
            maxSoFar = Math.max(currentMax, maxSoFar);
            if (maxSoFar == currentMax)
                endIndex = i;
        }

        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }
}
