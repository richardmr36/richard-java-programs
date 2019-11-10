package com.myprograms.algorithms.stack;

import java.util.Stack;

public class QueueUsingStacks<T> {
    Stack<T> stackNewestOnTop = new Stack<>();
    Stack<T> stackOldestOnTop = new Stack<>();

    public void enqueue(T value) {
        stackNewestOnTop.push(value);
    }

    public T peek() {
        shiftStackDataFromNewToOld();
        return stackOldestOnTop.peek();
    }

    public T dequeue() {
        shiftStackDataFromNewToOld();
        return stackOldestOnTop.pop();
    }

    private void shiftStackDataFromNewToOld() {
        if (stackOldestOnTop.empty()) {
            while (!stackNewestOnTop.empty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }
    }
}
