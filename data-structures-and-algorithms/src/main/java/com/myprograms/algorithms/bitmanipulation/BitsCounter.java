package com.myprograms.algorithms.bitmanipulation;

public class BitsCounter {
  public static int countWithRightShift(int n) {
    int count = 0;
    while (n > 0) {
      ++count;
      n >>= 1; // equivalent to (n = n >> 1) OR (n = n/2);
    }
    return count;
  }

  public static int countWithLeftShift(int n) {
    int count = 0;

    while ((1 << count) <= n) {
      count += 1;
    }
    return count;
  }
}
