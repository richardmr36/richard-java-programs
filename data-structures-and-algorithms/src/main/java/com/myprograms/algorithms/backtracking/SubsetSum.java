package com.myprograms.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static List<int[]> findSubsetSum(int[] arr, int targetSum) {
        int[] subsetArr = new int[arr.length];
        Arrays.fill(subsetArr, Integer.MIN_VALUE);
        List<int[]> subsetSolutionList = new ArrayList<>();
        findSubsetSum(arr, subsetArr, arr.length, 0, 0, 0, targetSum, subsetSolutionList);
        if(subsetSolutionList.size() == 0)
            throw new IllegalStateException("There is no solution");

        return subsetSolutionList;
    }

    private static void findSubsetSum(int[] arr, int[] subsetArr, int length, int subsetLength, int sumTillNow, int index, int targetSum, List<int[]> subsetSolutionList) {
        if (targetSum == sumTillNow) {
            subsetSolutionList.add(Arrays.copyOf(subsetArr, subsetLength));
            if (index < length - 1)
                findSubsetSum(arr, subsetArr, length, subsetLength - 1, sumTillNow - arr[index], index + 1, targetSum, subsetSolutionList);
            return;
        }

        for (int i = index; i < length; i++) {
            subsetArr[subsetLength] = arr[i];
            findSubsetSum(arr, subsetArr, length, subsetLength + 1, sumTillNow + arr[i], i + 1, targetSum, subsetSolutionList);
        }
    }
}
