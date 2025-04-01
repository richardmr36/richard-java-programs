package com.myprograms.algorithms.bitmanipulation;

public class CheckKthBitSetOrNot {
  public static boolean checkUsingLeftShift(int n, int k) {
    return (n & (1 << (k - 1))) != 0;
  }

  public static boolean checkUsingRightShift(int n, int k) {
    return ((n >> (k - 1)) & 1) == 1;
  }
}
