package com.myprograms.algorithms.arithmetic;

public class SquareRootFinder {
    public static double findSquareRootUsingBabylonianMethod(int n) {
        double x = n;
        double y = 1;
        double precision = 0.000000001;

        while (x - y > precision) {
            x = (x + y) / 2;
            y = n / x;
        }

        return x;
    }
}
