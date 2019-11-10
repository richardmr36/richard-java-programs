package com.myprograms.algorithms.searching;

public class TernarySearch {
    public static int findRecursively(int[] arr, int left, int right, int searchElement) {
        if (left > right)
            return -1;

        int mid1 = left + (right - left) / 3;
        int mid2 = right - (right - left) / 3;

        if (arr[mid1] == searchElement) return mid1;
        if (arr[mid2] == searchElement) return mid2;

        if (searchElement < arr[mid1])
            return findRecursively(arr, left, mid1 - 1, searchElement);
        else if (searchElement > arr[mid2])
            return findRecursively(arr, mid2 + 1, right, searchElement);
        else
            return findRecursively(arr, mid1 + 1, mid2 - 1, searchElement);
    }

    public static int findIteratively(int[] arr, int searchElement) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == searchElement) return mid1;
            if (arr[mid2] == searchElement) return mid2;

            if (searchElement < arr[mid1])
                right = mid1 - 1;
            else if (searchElement > arr[mid2])
                left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        return -1;
    }
}
