package com.myprograms.algorithms.arithmetic;

public class DivisibleByN {
    public static boolean isDivisibleBy11(long n) {
        int val = 0;
        String n_str = Long.toString(n);
        int len = n_str.length();

        int[] num = new int[len];
        for (int i = 0; i < len; i++)
            num[i] = Integer.parseInt(n_str.substring(i, i + 1));

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0)
                val -= num[i];
            else
                val += num[i];
        }

        return val % 11 == 0;
    }
}
