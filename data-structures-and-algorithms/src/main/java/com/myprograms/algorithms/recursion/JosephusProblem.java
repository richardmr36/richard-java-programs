package com.myprograms.algorithms.recursion;

public class JosephusProblem {
    //https://medium.com/@rrfd/explaining-the-josephus-algorithm-11d0c02e7212

    public static int findJosephusPosition(int n, int k) {
        if (n == 1)
            return 1;

        return ((findJosephusPosition(n - 1, k) + k - 1) % n) + 1;
    }
}
