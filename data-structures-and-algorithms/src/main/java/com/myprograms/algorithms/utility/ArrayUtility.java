package com.myprograms.algorithms.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ArrayUtility {

    public static int findMiddleElement(int low, int high) {
        return low + (high - low) / 2;
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String[] removeEmptyStringItems(final String[] input) {
        List<String> outputList = new ArrayList<>();
        for (String str : input) {
            if (!StringUtility.isEmpty(str))
                outputList.add(str);
        }

        String[] output = new String[outputList.size()];
        return outputList.toArray(output);
    }

    public static void initialiseArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = value;
    }

    public static void initialise2DArray(int[][] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                arr[i][j] = value;
    }

    public static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int findIndexOfMaxElement(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static int findIndexOfMaxElement(int[] arr, int sizeToBeConsidered) {
        int maxIndex = 0;
        for (int i = 1; i < sizeToBeConsidered; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static int findIndexOfMinElement(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int a : arr)
            sum += a;
        return sum;
    }

    public static void fill(int[][] matrix, int a) {
        for (int i = 0; i < matrix.length; i++)
            Arrays.fill(matrix[i], a);
    }

    public static int[] listToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        int i = 0;
        for (Integer index : list)
            array[i++] = index;

        return array;
    }
}
