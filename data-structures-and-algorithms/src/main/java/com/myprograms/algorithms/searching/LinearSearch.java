package com.myprograms.algorithms.searching;

public class LinearSearch {
    public static int find(int[] arr, int searchElement) {
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == searchElement)
                return i;

        return -1;
    }
}
