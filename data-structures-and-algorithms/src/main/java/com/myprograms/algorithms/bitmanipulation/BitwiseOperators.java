package com.myprograms.algorithms.bitmanipulation;

public class BitwiseOperators {
    public static boolean isPowerOfTwo(int x) {
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        return (x & (x - 1)) == 0;
    }

    public static void swapTwoNumbers(int x, int y) {
        System.out.printf("Before swapping: x=%d, y=%d\n", x, y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.printf("After swapping: x=%d, y=%d\n", x, y);
    }

    public static boolean isOdd(int num) {
        return (num & 1) != 0;
    }

    public static boolean isMultipleOfFour(int num) {
        return (num & 3) == 0;
    }

    public static boolean isMultipleOfThree(int num) {
        int oddPositionBitCount = 0;
        int evenPositionBitCount = 0;

        if (num < 0) num = -num;
        if (num == 0) return true;
        if (num == 1) return false;

        while (num != 0) {

            if ((num & 1) != 0)
                oddPositionBitCount++;
            num = num >> 1;

            if ((num & 1) != 0)
                evenPositionBitCount++;

            num = num >> 1;
        }

        return isMultipleOfThree(Math.abs(oddPositionBitCount - evenPositionBitCount));
    }

    public static boolean areBothIntegersWithOppositeSigns(int num1, int num2) {
        return (num1 ^ num2) < 0;
    }

    public static int numPlusOne(int num) {
        int m = 1;
        while ((num & m) >= 1) {
            num ^= m;
            m <<= 1;
        }

        num ^= m;
        return num;
    }

    public static int multiplyNumWithThreePointFive(int num) {
        return (num << 1) + num + (num >> 1);
    }

    public static int multiplyNumWithSeven(int num) {
        return (num << 3) - num;
    }

    public static int multiplyNumWithFifteen(int num) {
        return (num << 4) - num;
    }

    public static int multiplyTwoNumbersUsingRussianPeasantMethod(int num1, int num2) {
        int result = 0;
        while (num2 > 0) {
            if ((num2 & 1) != 0)
                result += num1;

            num1 <<= 1;
            num2 >>= 1;
        }

        return result;
    }

    public static boolean isDivisibleByEight(int num) {
        return ((num >> 3) << 3) == num;
    }
}
