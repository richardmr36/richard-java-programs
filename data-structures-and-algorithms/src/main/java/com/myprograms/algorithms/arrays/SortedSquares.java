package com.myprograms.algorithms.arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class SortedSquares {

    //Pattern:TwoPointers
    public static int[] sortSquaresOfSortedArray(int[] arr) {
        int n = arr.length;
        boolean isFirstElementLessThanOrEqualToZero = arr[0] <= 0;
        boolean isLastElementLessThanOrEqualToZero = arr[n - 1] <= 0;
        if(isFirstElementLessThanOrEqualToZero != isLastElementLessThanOrEqualToZero) {
            int positiveIntegerIndex = getFirstPositiveIntegerIndex(arr);
            int negativeIntegerIndex = positiveIntegerIndex - 1;
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                if (negativeIntegerIndex < 0) {
                    result[i] = arr[positiveIntegerIndex] * arr[positiveIntegerIndex];
                    positiveIntegerIndex++;
                }
                else if (positiveIntegerIndex >= n) {
                    result[i] = arr[negativeIntegerIndex] * arr[negativeIntegerIndex];
                    negativeIntegerIndex--;
                }
                else {
                    int squareOfPositiveIntegerIndexValue = arr[positiveIntegerIndex] * arr[positiveIntegerIndex];
                    int squareOfNegativeIntegerIndexValue = arr[negativeIntegerIndex] * arr[negativeIntegerIndex];
                    if (squareOfPositiveIntegerIndexValue < squareOfNegativeIntegerIndexValue) {
                        result[i] = squareOfPositiveIntegerIndexValue;
                        positiveIntegerIndex++;
                    }
                    else {
                        result[i] = squareOfNegativeIntegerIndexValue;
                        negativeIntegerIndex--;
                    }
                }
            }

            return result;
        }
        else if(isFirstElementLessThanOrEqualToZero) {
            ArrayUtility.reverse(arr);
        }

        ArrayUtility.square(arr);
        return arr;
    }

    private static int getFirstPositiveIntegerIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= 0)
                return i;

        throw new IllegalArgumentException("No positive numbers present");
    }
}
