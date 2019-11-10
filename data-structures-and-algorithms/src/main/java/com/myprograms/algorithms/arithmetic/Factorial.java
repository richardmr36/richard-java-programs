package com.myprograms.algorithms.arithmetic;

public class Factorial {
    public static int get(int n) {
        if (n <= 1)
            return 1;
        return n * get(n - 1);
    }
}
