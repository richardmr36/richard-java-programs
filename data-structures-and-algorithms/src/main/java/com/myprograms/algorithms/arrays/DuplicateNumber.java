package com.myprograms.algorithms.arrays;

import java.util.Arrays;

public class DuplicateNumber {
    public static int findDuplicateNoBetweenOneAndN(int[] arr) {
        int n = Arrays.stream(arr).max().getAsInt();
        int sumFrom1OneToN = n * (n + 1) / 2;
        int sumOfGivenNumbers = Arrays.stream(arr).sum();
        return sumOfGivenNumbers - sumFrom1OneToN;
    }

    public static int findDuplicateNoBetweenOneAndNUsingFloydAlgorithm(int[] arr) {
        if(arr == null || arr.length <= 1)
            return -1;

        int hare = 0, tortoise = 0, finder = 0;

        while (true) {
            hare = arr[arr[hare]];
            tortoise = arr[tortoise];
            if(hare == tortoise)
                break;
        }

        while (true) {
            tortoise = arr[tortoise];
            finder = arr[finder];
            if(tortoise == finder)
                return finder;
        }
    }
}
