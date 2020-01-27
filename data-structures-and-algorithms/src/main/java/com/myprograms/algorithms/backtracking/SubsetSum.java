package com.myprograms.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static List<int[]> findSubsetSumUsingBacktracking(int[] arr, int targetSum) {
        int[] subsetArr = new int[arr.length];
        Arrays.fill(subsetArr, Integer.MIN_VALUE);
        List<int[]> subsetSolutionList = new ArrayList<>();
        findSubsetSumUsingBacktracking(arr, subsetArr, arr.length, 0, 0, 0, targetSum, subsetSolutionList);
        if(subsetSolutionList.size() == 0)
            throw new IllegalStateException("There is no solution");

        return subsetSolutionList;
    }

    private static void findSubsetSumUsingBacktracking(int[] arr, int[] subsetArr, int length, int subsetLength, int sumTillNow, int index, int targetSum, List<int[]> subsetSolutionList) {
        if (targetSum == sumTillNow) {
            subsetSolutionList.add(Arrays.copyOf(subsetArr, subsetLength));
            if (index < length - 1)
                findSubsetSumUsingBacktracking(arr, subsetArr, length, subsetLength - 1, sumTillNow - arr[index-1], index + 1, targetSum, subsetSolutionList);
            return;
        }

        for (int i = index; i < length; i++) {
            subsetArr[subsetLength] = arr[i];
            findSubsetSumUsingBacktracking(arr, subsetArr, length, subsetLength + 1, sumTillNow + arr[i], i + 1, targetSum, subsetSolutionList);
        }
    }

    public static int[] findFeasibleSubsetUsingDP(int[] arr, int sum) {
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
