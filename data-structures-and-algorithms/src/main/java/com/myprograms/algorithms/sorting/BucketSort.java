package com.myprograms.algorithms.sorting;

import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {

    private static final int BUCKET_SIZE = 10;

    public static void sort(double[] arr) {

        LinkedList<Double>[] bucket = new LinkedList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++)
            bucket[i] = new LinkedList<>();

        for (int i = 0; i < arr.length; i++)
            bucket[(int)(BUCKET_SIZE * arr[i])].add(arr[i]);

        for (int i = 0; i < BUCKET_SIZE; i++)
            if (bucket[i].size() > 1)
                Collections.sort(bucket[i]);

        int index = 0;
        for (int i = 0; i < BUCKET_SIZE; i++)
            if (bucket[i].size() > 0)
                for (Double x : bucket[i])
                    arr[index++] = x;
    }
}
