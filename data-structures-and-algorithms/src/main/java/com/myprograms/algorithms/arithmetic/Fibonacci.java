package com.myprograms.algorithms.arithmetic;

import static com.myprograms.algorithms.utility.NumberUtility.isPerfectSquare;

public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static int getFibonacci(int n, int[] memo) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (memo[n] == -1)
            memo[n] = getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo);

        return memo[n];
    }

    public static int getFibonacciWithSpaceOptimized(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int c = 0, a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static int getFibonacciUsingGoldenRatio(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    public static int getIndexOfGivenFibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int c = 0, a = 0, b = 1;
        int index = 1;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            index++;
        }

        if (n != c)
            return -1;

        return index;
    }

    public static int getIndexOfGivenFibonacciUsingFormula(int n) {
        return Math.round(2.078087F * (float) Math.log(n) + 1.672276F);
    }

    public static boolean isFibonacci(int n) {
        return getIndexOfGivenFibonacci(n) != -1;
    }

    public static boolean isFibonacciUsingFormula(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isMthFibonacciDividesNth(int m, int n) {
        return n == 2 || m == 2 || n % m == 0;
    }
}
