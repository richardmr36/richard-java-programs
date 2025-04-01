package com.myprograms.algorithms.stack;

import java.util.Stack;

public class DecimalToBinaryConverter {

  public static String convert(int n) {
    Stack<Integer> stack = new Stack<>();

    while (n > 0) {
      int remainder = n % 2;
      stack.push(remainder);
      n >>= 1; // equivalent to n = n/2;
    }

    String result = "";
    while (!stack.isEmpty()) {
      result += stack.pop();
    }

    return result;
  }
}
