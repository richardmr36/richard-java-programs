package com.myprograms.algorithms.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
  public static List<List<Integer>> find(int[] arr) {
    List<List<Integer>> result = new ArrayList<>();
    int n = arr.length;
    int powSize = (int) Math.pow(2, n);

    for (int i = 0; i < powSize; i++) {
      List<Integer> val = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) != 0) {
          val.add(arr[j]);
        }
      }
      result.add(val);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {1, 23, 3};
    System.out.println(find(nums));
  }
}
