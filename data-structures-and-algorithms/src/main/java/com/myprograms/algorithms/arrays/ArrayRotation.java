package com.myprograms.algorithms.arrays;

public class ArrayRotation {
    public int[] rightRotation(int[] a, int d) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i + d < a.length) {
                b[i + d] = a[i];
            } else {
                b[i + d - a.length] = a[i];
            }
        }

        return b;
    }

    public int[] leftRotation(int[] a, int d) {
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            if (i - d >= 0 && i - d < a.length) {
                b[i - d] = a[i];
            } else {
                b[a.length + (i - d)] = a[i];
            }
        }

        return b;
    }

}
