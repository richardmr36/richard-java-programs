package com.myprograms.algorithms.arithmetic;

public class Combination {
    public static int nCr(int n, int r) {
        int nFactorial = Factorial.get(n);
        int rFactorial = Factorial.get(r);
        int nrFactorial = Factorial.get(n-r);
        return nFactorial / (rFactorial * nrFactorial);
    }
}
