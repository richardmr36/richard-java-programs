package com.myprograms.algorithms.arithmetic;

public class PowerOfTwo {
  public static boolean findUsingLogarithm(int n) {
    if (n == 0)
      return false;

    double val = Math.log(n) / Math.log(2);
    return (int) (Math.ceil(val)) == (int) (Math.floor(val));
  }

  public static boolean findUsingBrianKernighanAlgorithm(int n) {
    return n != 0 && (n & (n - 1)) == 0;
  }
}
