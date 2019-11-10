package com.myprograms.algorithms.arrays;

import java.util.Arrays;

public class DuplicateNumber {
    public int findDuplicateNoBetweenOneAndN(int[] arr) {
        int n = Arrays.stream(arr).max().getAsInt();
        int sumFrom1OneToN = n * (n + 1) / 2;
        int sumOfGivenNumbers = Arrays.stream(arr).sum();
        return sumOfGivenNumbers - sumFrom1OneToN;
    }
}
