package com.myprograms.algorithms.bitmanipulation;

public class FirstSetBitPosition {

  public static int findUsingLeftShift(int n) {
    if (n == 0) {
      return 0;
    }

    int k = 1;

    while (true) {
      if (!CheckKthBitSetOrNot.checkUsingLeftShift(n, k)) {
        k++;
      } else {
        return k;
      }
    }
  }

  public static int findUsingRightShift(int n) {
    if (n == 0) {
      return 0;
    }

    int k = 1;

    while (true) {
      if (!CheckKthBitSetOrNot.checkUsingRightShift(n, k)) {
        k++;
      } else {
        return k;
      }
    }
  }
}
