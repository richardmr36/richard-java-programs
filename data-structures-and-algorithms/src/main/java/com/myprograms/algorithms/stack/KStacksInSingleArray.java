package com.myprograms.algorithms.stack;

import java.util.Arrays;

public class KStacksInSingleArray {
    private int[] arr;
    private int[] top;
    private int[] next;
    private int sizeOfArray;
    private int noOfStacks;
    private int beginningOfFreeList;

    public KStacksInSingleArray(int sizeOfArray, int noOfStacks) {
        this.sizeOfArray = sizeOfArray;
        this.noOfStacks = noOfStacks;
        arr = new int[sizeOfArray];
        top = new int[noOfStacks];
        next = new int[sizeOfArray];
        Arrays.fill(top, -1);
        beginningOfFreeList = 0;
        for (int i = 0; i < sizeOfArray - 1; i++)
            next[i] = i + 1;
        next[sizeOfArray - 1] = -1;
    }

    public boolean isFull() {
        return beginningOfFreeList == -1;
    }

    public boolean isEmpty(int stackNo) {
        return top[stackNo] == -1;
    }

    public void push(int item, int stackNo) {
        if (isFull())
            throw new IllegalStateException("Stack is full");

        int i = beginningOfFreeList;
        beginningOfFreeList = next[i];
        next[i] = top[stackNo];
        top[stackNo] = i;
        arr[i] = item;
    }

    public int pop(int stackNo) {
        if (isEmpty(stackNo))
            throw new IllegalStateException("Stack is empty");

        int i = top[stackNo];
        top[stackNo] = next[i];
        next[i] = beginningOfFreeList;
        beginningOfFreeList = i;
        return arr[i];
    }
}
