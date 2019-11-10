package com.myprograms.algorithms.arithmetic;

public class PronicNumber {
    public int generate(int n) {
        return n * (n+1);
    }

    public boolean validate(int n) {
        int squareRootOfN = (int)Math.sqrt(n);

        return squareRootOfN * (squareRootOfN + 1) == n;
    }
}
