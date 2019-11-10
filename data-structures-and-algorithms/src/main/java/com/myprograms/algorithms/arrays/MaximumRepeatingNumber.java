package com.myprograms.algorithms.arrays;

public class MaximumRepeatingNumber {
    /*https://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/*/

    public int findMaxRepeatingNumberWithMaxValueLessThanK(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            arr[arr[i] % k] += k;

        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }

        //Restoring array
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] % k;

        return result;
    }
}
