package com.myprograms.algorithms.general;

public class SetBitsCounter {

    public static int countIteratively(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        return count;
    }

    public static int countRecursively(int num) {
        if (num == 0)
            return num;

        return (num & 1) + countRecursively(num >> 1);
    }

    public static int countUsingBrianKernighanAlgorithm(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }

        return count;
    }
}
