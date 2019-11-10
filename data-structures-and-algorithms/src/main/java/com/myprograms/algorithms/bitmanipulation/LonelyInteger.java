package com.myprograms.algorithms.bitmanipulation;

public class LonelyInteger {

    public int findLonelyInteger(int[] numbers) {
        int result = 0;
        for(int i : numbers) {
            result ^= i;
        }
        return result;
    }
}
