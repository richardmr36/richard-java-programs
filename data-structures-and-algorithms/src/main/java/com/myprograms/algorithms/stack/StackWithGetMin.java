package com.myprograms.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithGetMin {
    private Deque<Integer> stack = new ArrayDeque<>();
    private int minElement = 0;

    public int getMin() {
        if (stack.isEmpty())
            throw new IllegalStateException("Stack is empty");

        return minElement;
    }

    public void push(int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            minElement = data;
            return;
        }

        if (data < minElement) {
            stack.push(2 * data - minElement);
            minElement = data;
        }
        else {
            stack.push(data);
        }
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException("Stack is empty");

        int data = stack.pop();
        if (data < minElement) {
            int temp = minElement;
            minElement = 2 * minElement - data;
            return temp;
        }
        else
            return data;
    }
}
