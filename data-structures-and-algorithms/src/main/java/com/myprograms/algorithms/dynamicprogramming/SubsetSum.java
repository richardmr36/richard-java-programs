package com.myprograms.algorithms.dynamicprogramming;

import java.util.Arrays;

public class SubsetSum {
    public static int[] findFeasibleSubset(int[] arr, int sum) {
        boolean[][] subsetSumTable = new boolean[arr.length + 1][sum + 1];

        initialiseForZeroSumColumn(subsetSumTable, arr.length);

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1])
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j];
                else if (subsetSumTable[i - 1][j])
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j];
                else
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j - arr[i - 1]];
            }
        }

        return getSubsetArray(subsetSumTable, arr, sum);
    }

    private static int[] getSubsetArray(boolean[][] subsetSumTable, int[] arr, int sum) {
        if (!subsetSumTable[arr.length][sum])
            throw new IllegalStateException("There is no solution");

        int[] result = new int[arr.length];
        int index = 0;
        for (int i = arr.length, j = sum; i > 0 || j > 0; ) {
            if (subsetSumTable[i][j] && subsetSumTable[i - 1][j])
                i--;
            else {
                result[index++] = arr[i - 1];
                j = j - arr[i - 1];
                i--;
            }
        }

        return Arrays.copyOf(result, index);
    }

    private static void initialiseForZeroSumColumn(boolean[][] subsetSumTable, int length) {
        for (int i = 0; i < length; i++)
            subsetSumTable[i][0] = true;
    }
}
