package com.myprograms.algorithms.bitmanipulation;

public class HammingDistance {
  //number of positions where the bits are different for the given input

  public static int find(int a, int b) {
    int xor = a ^ b;
    int distance = 0;

    while (xor != 0) {
      if (xor % 2 == 1) {
        distance += 1;
      }
      xor >>= 1;
    }

    return distance;
  }

  public static int findUsingBrianKernighanAlgorithm(int a, int b) {
    int xor = a ^ b;
    int distance = 0;

    while (xor != 0) {
      distance += 1;
      xor &= ( xor - 1);
    }

    return distance;
  }
}
