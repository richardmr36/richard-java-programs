package com.myprograms.algorithms.sorting;

import java.util.Arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class PigeonHoleSort {
    public static void sort(int[] arr) {
        int min = ArrayUtility.findMinElement(arr);
        int max = ArrayUtility.findMaxElement(arr);
        int range = max - min + 1;

        int[] pigeonHoles = new int[range];
        Arrays.fill(pigeonHoles, 0);

        for (int i = 0; i < arr.length; i++)
            pigeonHoles[arr[i] - min]++;

        for (int i = 0, j = 0; j < range; j++) {
            while (pigeonHoles[j]-- > 0) {
                arr[i++] = j + min;
            }
        }
    }
}
