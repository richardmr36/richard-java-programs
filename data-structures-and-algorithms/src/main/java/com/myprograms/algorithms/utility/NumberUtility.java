package com.myprograms.algorithms.utility;

public final class NumberUtility {
    public static boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
}
