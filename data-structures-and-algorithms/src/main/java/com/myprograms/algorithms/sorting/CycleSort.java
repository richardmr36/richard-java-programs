package com.myprograms.algorithms.sorting;

import com.myprograms.algorithms.utility.ArrayUtility;

public class CycleSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item)
                    pos++;
            }

            if (pos == cycleStart) //If item is already in correct position
                continue;

            while (item == arr[pos]) //Ignoring all duplicates
                pos++;

            if (pos != cycleStart)
                item = replaceItem(arr, item, pos);

            // Rotate rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++)
                    if (arr[i] < item)
                        pos++;

                while (item == arr[pos])
                    pos++;

                if (item != arr[pos])
                    item = replaceItem(arr, item, pos);
            }
        }
    }

    private static int replaceItem(int[] arr, int item, int pos) {
        int temp = item;
        item = arr[pos];
        arr[pos] = temp;
        return item;
    }
}
