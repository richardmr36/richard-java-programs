package com.myprograms.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarrayProblems {
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

    public static int[] findTwoElementsWhoseSumIsTheClosestToZero(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int minLeft = 0;
        int minRight = n - 1;

        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                minLeft = left;
                minRight = right;
            }

            if (sum < 0)
                left++;
            else
                right--;
        }

        int[] result = new int[2];
        result[0] = arr[minLeft];
        result[1] = arr[minRight];
        return result;
    }

    public static boolean isAnyOfContiguousSubarraySumZero(int[] arr) {
        Set<Integer> sumSet = new HashSet<>();
        int sum = 0;
        for (int a : arr) {
            sum += a;
            if (a == 0 || sum == 0 || sumSet.contains(sum))
                return true;
            sumSet.add(sum);
        }

        return false;
    }

    public int findLengthOfLongestSubarrayDivisibleByK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int[] modArray = new int[n];

        for (int i = 0, sum = 0; i < n; i++) {
            sum += arr[i];
            modArray[i] = ((sum % k) + k) % k; //Taking modulo twice due to possible negative sum
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (modArray[i] == 0)
                max = i + 1;

            else if (!map.containsKey(modArray[i]))
                map.put(modArray[i], i);

            else
                max = Math.max(max, i - map.get(modArray[i]));
        }

        return max;
    }

    public int countNoOfSubarraysDivisibleByK(int[] arr, int k) {
        int n = arr.length;
        int[] modArray = new int[k];
        Arrays.fill(modArray, 0);

        for (int i = 0, sum = 0; i < n; i++) {
            sum += arr[i];
            modArray[((sum % k) + k) % k]++;
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            if (modArray[i] > 1)
                result += (modArray[i] * (modArray[i] - 1)) / 2;
        }

        return result + modArray[0];
    }
}
