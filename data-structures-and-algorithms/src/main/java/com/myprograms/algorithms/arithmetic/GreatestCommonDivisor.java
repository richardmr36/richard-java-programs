package com.myprograms.algorithms.arithmetic;

public class GreatestCommonDivisor {
    public static int findGreatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0 || a == b)
            return a;

        if (a > b)
            return findGreatestCommonDivisor(a - b, a);
        return findGreatestCommonDivisor(a, b - a);
    }

    public static int findGcdUsingEuclideanMethod(int a, int b) {
        if (b == 0)
            return a;
        return findGcdUsingEuclideanMethod(b, a % b);
    }

    public static int findGcdUsingEuclideanMethodIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findGcdOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result = findGcdUsingEuclideanMethod(arr[i], result);

        return result;
    }
}
