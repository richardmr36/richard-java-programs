package com.myprograms.algorithms.arrays;

import java.util.HashSet;

import com.myprograms.algorithms.searching.SortedRotatedArraySearch;

public class PairWithGivenSum {
    public static int[] findPairOfElementsWithGivenSumForSortedArrayUsingLoop(int[] arr, int sum) {
        int l = 0;
        int r = arr.length - 1;
        int[] result = new int[2];

        while (l < r) {
            if (arr[l] + arr[r] == sum) {
                result[0] = arr[l];
                result[1] = arr[r];
                break;
            }

            if (arr[l] + arr[r] > sum)
                r--;
            else
                l++;
        }

        return result;
    }

    public static int[] findPairOfElementsWithGivenSumUsingHash(int[] arr, int sum) {
        HashSet<Integer> elements = new HashSet<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (temp >= 0 && elements.contains(temp)) {
                result[0] = temp;
                result[1] = arr[i];
                break;
            }

            elements.add(arr[i]);
        }

        return result;
    }

    public static int[] findPairOfElementsWithGivenSumForSortedRotatedArray(int[] arr, int sum) {
        int n = arr.length;
        int left = new SortedRotatedArraySearch().findMinimumElementIndexFromSortedRotatedArray(arr, 0, n - 1);
        int right = left - 1;
        int[] result = new int[2];

        while (left != right) {
            if (arr[left] + arr[right] == sum) {
                result[0] = arr[left];
                result[1] = arr[right];
                break;
            }

            if (arr[left] + arr[right] < sum)
                left = (left + 1) % n;
            else
                right = (n - 1 + right) % n;
        }

        return result;
    }

    public static int findCountOfDistinctPairs(int[] arr, int sum) {
        HashSet<Integer> elements = new HashSet<>();
        HashSet<Integer> exactHalfMatch = new HashSet<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (temp >= 0 && elements.contains(temp)) {
                if(!elements.contains(arr[i])) {
                    result++;
                }
                else if(temp == arr[i] && !exactHalfMatch.contains(arr[i])) {
                    exactHalfMatch.add(arr[i]);
                    result++;
                }
            }

            elements.add(arr[i]);
        }

        return result;
    }
}
