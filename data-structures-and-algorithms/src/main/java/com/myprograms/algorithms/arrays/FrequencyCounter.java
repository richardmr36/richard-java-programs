package com.myprograms.algorithms.arrays;

public class FrequencyCounter {
    /*https://geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/*/

    public void countFrequencyOfArrayElementsWithMaxValueEqualToArraySize(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }

            int elementIndex = arr[i] - 1;
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            } else {
                arr[elementIndex]--;
                arr[i] = 0;
                i++;
            }
        }

        for (i = 0; i < n; i++)
            System.out.println(i + 1 + " -> " + Math.abs(arr[i]));
    }

    public void countFrequencyOfArrayElementsWithMaxValueEqualToArraySize_1(int[] arr) {
        int n = arr.length;
        for (int a : arr)
            a -= 1;

        for (int i = 0; i < n; i++)
            arr[arr[i] % n] += n;

        for (int i = 0; i < n; i++)
            System.out.println(i + 1 + " -> " + arr[i] / n);

    }
}
