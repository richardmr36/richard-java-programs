package com.myprograms.algorithms.stack;

public class TwoStacksInSingleArray {
    private int[] arr;
    private int sizeOfArray;
    private int topOfFirstStack;
    private int topOfSecondStack;

    public TwoStacksInSingleArray(int n) {
        sizeOfArray = n;
        arr = new int[sizeOfArray];
        topOfFirstStack = -1;
        topOfSecondStack = sizeOfArray;
    }

    public void pushToFirstStack(int item) {
        if(topOfFirstStack < topOfSecondStack - 1)
            arr[++topOfFirstStack] = item;
        else
            throw new IllegalStateException("First Stack is full");
    }

    public int popFromFirstStack() {
        if(topOfFirstStack > -1)
            return arr[topOfFirstStack--];
        else
            throw new IllegalStateException("First Stack is empty");
    }

    public void pushToSecondStack(int item) {
        if(topOfFirstStack < topOfSecondStack - 1)
            arr[--topOfSecondStack] = item;
        else
            throw new IllegalStateException("Second Stack is full");
    }

    public int popFromSecondStack() {
        if(topOfSecondStack < sizeOfArray)
            return arr[topOfSecondStack++];
        else
            throw new IllegalStateException("Second Stack is empty");
    }
}
