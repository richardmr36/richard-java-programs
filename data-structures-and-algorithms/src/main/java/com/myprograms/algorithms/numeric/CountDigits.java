package com.myprograms.algorithms.numeric;

public class CountDigits {

  public static int countUsingLoop(int n) {
    int count = 0;
    while (n > 0) {
      ++count;
      n /= 10;
    }
    return count;
  }

  public static int countUsingLogarithm(int n) {
    return n != 0 ? ((int) Math.floor(Math.log10(n) + 1)) : -1;
  }

  public static int countUsingRecursion(int n) {
    if (n == 0) {
      return 0;
    }
    return (1 + countUsingRecursion(n / 10));
  }

  public static int countUsingStringFunction(int n) {
    return Integer.toString(n).length();
  }
}
