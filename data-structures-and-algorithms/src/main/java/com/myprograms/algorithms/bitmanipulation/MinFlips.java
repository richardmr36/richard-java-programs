package com.myprograms.algorithms.bitmanipulation;

public class MinFlips {
  //minimum flips required in some bits of a, b to make (a OR b) == c

  public static int find(int a, int b, int c) {
    int noOfFlips = 0;
    for (int i = 0; i < 32; i++) {
      int bitC = ((c >> i) & 1);
      int bitA = ((a >> i) & 1);
      int bitB = ((b >> i) & 1);

      if ((bitA | bitB) != bitC) {
        if (bitC == 0) {
          if (bitA == 1 && bitB == 1) {
            noOfFlips += 2;
          } else {
            noOfFlips += 1;
          }
        } else {
          noOfFlips += 1;
        }
      }
    }
    return noOfFlips;
  }
}
