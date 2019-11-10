package com.myprograms.algorithms.hashing;

import java.util.HashMap;

/*https://www.geeksforgeeks.org/majority-element/*/
public class MajorityElement {
    public void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            } else
                map.put(arr[i], 1);
        }
        System.out.println(" No Majority element");
    }

    /*For sorted arrays*/
    int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = (low + high) / 2;  /*low + (high - low)/2;*/

            /* Check if arr[mid] is the first occurrence of x.
                arr[mid] is first occurrence if x is one of the following
                is true:
                (i)  mid == 0 and arr[mid] == x
                (ii) arr[mid-1] < x and arr[mid] == x
            */
            if ((mid == 0 || x > arr[mid - 1]) && (arr[mid] == x))
                return mid;
            else if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high, x);
            else
                return binarySearch(arr, low, (mid - 1), x);
        }

        return -1;
    }


    /* This function returns true if the x is present more than n/2
        times in arr[] of size n */
    boolean isMajority(int[] arr, int n, int x) {
        /* Find the index of first occurrence of x in arr[] */
        int i = binarySearch(arr, 0, n - 1, x);

        /* If element is not present at all, return false*/
        if (i == -1)
            return false;

        /* check if the element is present more than n/2 times */
        return ((i + n / 2) <= (n - 1)) && arr[i + n / 2] == x;
    }

}
