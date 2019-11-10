package com.myprograms.algorithms.searching;

import com.myprograms.algorithms.utility.ArrayUtility;

public class SortedRotatedArraySearch {
    private BinarySearch binarySearch = new BinarySearch();

    public int findElementFromSortedRotatedArray(int[] arr, int element) {
        int n = arr.length - 1;
        int pivot = findPivot(arr, 0, n);
        if (pivot == -1)
            return binarySearch.findRecursively(arr, 0, n, element);

        if (arr[pivot] == element)
            return pivot;

        if (arr[0] <= element)
            return binarySearch.findRecursively(arr, 0, pivot - 1, element);
        return binarySearch.findRecursively(arr, pivot + 1, n, element);
    }

    private int findPivot(int[] arr, int low, int high) {
        return findMaximumElementIndexFromSortedRotatedArray(arr, low, high);
    }

    public int findMaximumElementIndexFromSortedRotatedArray(int[] arr, int low, int high) {
        if (high < low)
            return -1;

        if (high == low)
            return low;

        int mid = ArrayUtility.findMiddleElement(low,high);
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;

        if (mid > low && arr[mid] < arr[mid - 1])
            return mid - 1;

        if (arr[low] >= arr[mid])
            return findMaximumElementIndexFromSortedRotatedArray(arr, low, mid - 1);
        return findMaximumElementIndexFromSortedRotatedArray(arr, mid + 1, high);
    }

    public int findMinimumElementIndexFromSortedRotatedArray(int[] arr, int low, int high) {
        if (high < low)
            return -1;

        if (high == low)
            return low;

        int mid = ArrayUtility.findMiddleElement(low,high);
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid + 1;

        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;

        if (arr[low] >= arr[mid])
            return findMinimumElementIndexFromSortedRotatedArray(arr, low, mid - 1);
        return findMinimumElementIndexFromSortedRotatedArray(arr, mid + 1, high);
    }

    public int findElementWithOnePass(int[] arr, int low, int high, int element) {
        if (low > high)
            return -1;

        int mid = ArrayUtility.findMiddleElement(low,high);
        if (arr[mid] == element)
            return mid;

        if (arr[low] < arr[mid]) {
            if (element >= arr[low] && element <= arr[mid])
                return findElementWithOnePass(arr, low, mid - 1, element);
            return findElementWithOnePass(arr, mid + 1, high, element);
        }

        if (element >= arr[mid] && element <= arr[high])
            return findElementWithOnePass(arr, mid + 1, high, element);
        return findElementWithOnePass(arr, low, mid - 1, element);
    }
}
