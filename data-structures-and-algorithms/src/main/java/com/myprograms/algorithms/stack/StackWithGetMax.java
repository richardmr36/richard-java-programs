package com.myprograms.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithGetMax {
    private Deque<Integer> stack = new ArrayDeque<>();
    private int maxElement = 0;

    public int getMax() {
        if (stack.isEmpty())
            throw new IllegalStateException("Stack is empty");

        return maxElement;
    }

    public void push(int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            maxElement = data;
            return;
        }

        if (data > maxElement) {
            stack.push(2 * data - maxElement);
            maxElement = data;
        }
        else {
            stack.push(data);
        }
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException("Stack is empty");

        int data = stack.pop();
        if (data > maxElement) {
            int temp = maxElement;
            maxElement = 2 * maxElement - data;
            return temp;
        }
        else
            return data;
    }
}
