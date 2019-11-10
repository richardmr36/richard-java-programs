package com.myprograms.algorithms.searching;

public class InterpolationSearch {
    public static int findIteratively(int[] arr, int searchElement) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right && searchElement >= arr[left] && searchElement <= arr[right]) {
            int position = findProbePosition(left, right, arr, searchElement);
            if (arr[position] == searchElement)
                return position;

            if (arr[position] < searchElement)
                left = position + 1;
            else
                right = position - 1;
        }

        return -1;
    }

    public static int findRecursively(int[] arr, int left, int right, int searchElement) {
        if (left > right)
            return -1;

        int position = findProbePosition(left, right, arr, searchElement);

        if (arr[position] == searchElement)
            return position;

        if (arr[position] > searchElement)
            return findRecursively(arr, left, position - 1, searchElement);

        return findRecursively(arr, position + 1, right, searchElement);
    }

    // The idea of formula is to return higher value of position when element to be searched is closer to arr[right].
    // And smaller value when closer to arr[left]
    private static int findProbePosition(int left, int right, int[] arr, int searchElement) {
        int numerator = (searchElement - arr[left]) * (right - left);
        int denominator = arr[right] - arr[left];
        int delta = numerator / denominator;
        return left + delta;
    }
}
