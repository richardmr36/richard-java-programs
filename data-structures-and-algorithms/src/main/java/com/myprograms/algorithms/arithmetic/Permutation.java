package com.myprograms.algorithms.arithmetic;

public class Permutation {
    public static int nPr(int n, int r) {
        int nFactorial = Factorial.get(n);
        int nrFactorial = Factorial.get(n-r);
        return nFactorial / nrFactorial;
    }
}
