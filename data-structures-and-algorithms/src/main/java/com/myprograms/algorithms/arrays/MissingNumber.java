package com.myprograms.algorithms.arrays;

import java.util.Arrays;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        final int total = (n + 1) * (n + 2) / 2;
        return total - Arrays.stream(arr).sum();
    }

    public static int findMissingNumberUsingXOR(int[] arr) {
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

    public static int[] findTwoMissingNumbers(int[] arr) {
        int size = arr.length + 2;

        long totalSum = size * (size + 1) / 2;

        long arrSum = 0;
        for (int i : arr)
            arrSum += i;

        int pivot = (int) ((totalSum - arrSum) / 2);

        int totalLeftXor = 0;
        int arrLeftXor = 0;
        int totalRightXor = 0;
        int arrRightXor = 0;

        for (int i = 1; i <= pivot; i++) totalLeftXor ^= i;
        for (int i = pivot + 1; i <= size; i++) totalRightXor ^= i;
        for (int i : arr) {
            if (i <= pivot) arrLeftXor ^= i;
            else arrRightXor ^= i;
        }

        return new int[]{totalLeftXor ^ arrLeftXor, totalRightXor ^ arrRightXor};
    }
}
