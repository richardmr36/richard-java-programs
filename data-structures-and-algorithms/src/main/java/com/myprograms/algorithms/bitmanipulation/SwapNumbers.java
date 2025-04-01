package com.myprograms.algorithms.bitmanipulation;

public class SwapNumbers {

  public static String swap(int a, int b) {
    a = a ^ b;
    b = b ^ a;
    a = a ^ b;
    return a + "," + b;
  }
}
