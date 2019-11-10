package com.myprograms.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingSubsequence {
    Map<Integer, Integer> sequence = new HashMap<>();

    public int getSubsequenceUsingRecursion(int[] arr, int n) {
        if (n == 1) return 1;

        int maxResultEnding = 1;

        for (int i = 1; i < n; i++) {
            int result = getSubsequenceUsingRecursion(arr, i);

            if (arr[i - 1] < arr[n - 1] && result + 1 > maxResultEnding) {
                if (!sequence.containsKey(i - 1)) {
                    sequence.put(i - 1, arr[i - 1]);
                }
                maxResultEnding = result + 1;
            }
        }
        return maxResultEnding;
    }

    public int getSubsequenceUsingMemoization(int[] arr, int n, int[] memo) {
        if (n == 1) return 1;

        int result;
        int maxResultEnding = 1;

        for (int i = 1; i < n; i++) {
            if (memo[i] == 0)
                memo[i] = result = getSubsequenceUsingMemoization(arr, i, memo);
            else
                result = memo[i];
            if (arr[i - 1] < arr[n - 1] && result + 1 > maxResultEnding) {
                if (!sequence.containsKey(i - 1)) {
                    sequence.put(i - 1, arr[i - 1]);
                }
                maxResultEnding = result + 1;
            }
        }
        return maxResultEnding;
    }

    public int getSubsequenceUsingDp(int[] arr, int n) {
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        return Arrays.stream(lis).max().getAsInt();
    }

    public int[] getArray(int[] arr) {
        int[] expected = new int[sequence.size() + 1];
        int index = 0;
        for (Integer i : sequence.keySet())
            expected[index++] = sequence.get(i);

        expected[index] = arr[arr.length - 1];
        return expected;
    }
}
