package com.myprograms.algorithms.bitmanipulation;

public class DetectIfTwoIntegersHaveOppositeSigns {
  public static boolean detect(int a, int b) {
    return (a ^ b) < 0;
  }
}
