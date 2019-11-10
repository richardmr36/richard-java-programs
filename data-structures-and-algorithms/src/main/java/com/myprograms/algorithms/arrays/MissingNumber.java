package com.myprograms.algorithms.arrays;

import java.util.Arrays;

public class MissingNumber {
    public int findMissingNumber(int[] arr) {
        int n = arr.length;
        final int total = (n + 1) * (n + 2) / 2;
        return total - Arrays.stream(arr).sum();
    }

    public int findMissingNumberUsingXOR(int[] arr) {
        int n = arr.length;
        int totalExpected = 0, totalActual = 0;
        for (int i = 1; i <= n + 1; i++) {
            totalExpected = totalExpected ^ i;
        }

        for (int i = 0; i < n; i++) {
            totalActual = totalActual ^ arr[i];
        }

        return totalExpected ^ totalActual;

    }
}
