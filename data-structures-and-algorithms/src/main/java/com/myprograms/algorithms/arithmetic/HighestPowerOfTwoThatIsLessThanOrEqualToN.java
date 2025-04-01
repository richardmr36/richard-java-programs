package com.myprograms.algorithms.arithmetic;

public class HighestPowerOfTwoThatIsLessThanOrEqualToN {
    public static int determine(int n) {
        if(PowerOfTwo.findUsingBrianKernighanAlgorithm(n))
            return n;

        return highestPowerOfTwoWhichIsLessThanN(n);
    }

    private static int highestPowerOfTwoWhichIsLessThanN(int n) {
        int p = (int) (Math.log(n) / Math.log(2));
        return (int) Math.pow(2, p);
    }
}
