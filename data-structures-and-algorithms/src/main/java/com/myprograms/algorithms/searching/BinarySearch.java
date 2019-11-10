package com.myprograms.algorithms.searching;

public class BinarySearch {
    public static int findRecursively(int[] arr, int left, int right, int searchElement) {
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2; //To avoid integer overflow

        if (arr[mid] == searchElement)
            return mid;

        if (arr[mid] > searchElement)
            return findRecursively(arr, left, mid - 1, searchElement);

        return findRecursively(arr, mid + 1, right, searchElement);
    }

    public static int findIteratively(int[] arr, int searchElement) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == searchElement)
                return mid;

            if (arr[mid] > searchElement)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}
