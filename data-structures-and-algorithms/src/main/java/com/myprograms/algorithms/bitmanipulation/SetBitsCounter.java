package com.myprograms.algorithms.bitmanipulation;

public class SetBitsCounter {

    public static int countIterativelyWithRightShift(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        return count;
    }

    public static int countIterativelyWithLeftShift(int num) {
        int count = 0;
        int mask = 1;
        while (mask <= num) {
            if ((num & mask) > 0) {
                count += 1;
            }
            mask <<= 1;
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
