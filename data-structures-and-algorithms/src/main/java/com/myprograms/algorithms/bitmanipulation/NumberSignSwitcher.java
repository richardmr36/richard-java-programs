package com.myprograms.algorithms.bitmanipulation;

public class NumberSignSwitcher {
  public static int switchSign(int number){
    // ~n returns One's compliment and (~n + 1) is done to get Two's complement
    // Because computers represent negative numbers using two's complement
    return ~number + 1;
  }
}
