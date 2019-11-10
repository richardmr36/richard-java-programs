package com.myprograms.algorithms.stack;

import java.util.Stack;

// https://www.geeksforgeeks.org/the-stock-span-problem/

public class StockSpanProblem {
    public static int[] findStockSpanUsingStack(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!stack.empty() && price[stack.peek()] < price[i])
                stack.pop();

            span[i] = stack.empty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return span;
    }

    public static int[] findStockSpanUsingLoop(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            span[i] = 1;
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
                span[i]++;
        }

        return span;
    }
}

