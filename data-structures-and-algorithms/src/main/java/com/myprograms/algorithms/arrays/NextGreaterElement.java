package com.myprograms.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] findNextGreaterElementUsingLoop(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                    break;
                }
            }
            result[i] = max;
        }

        return result;
    }

    public int[] findNextGreaterElementUsingStack(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> indexMap = new HashMap<>(n);
        int[] result = new int[n];
        Arrays.fill(result, -1);
        for (int i = 0; i < n; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                indexMap.put(arr[i], i);
                continue;
            }

            while (stack.peek() < arr[i]) {
                result[indexMap.get(stack.pop())] = arr[i];
                if (stack.empty())
                    break;
            }
            stack.push(arr[i]);
            indexMap.put(arr[i], i);
        }

        return result;
    }
}
