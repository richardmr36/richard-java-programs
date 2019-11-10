package com.myprograms.algorithms.arithmetic;

public class KrishnamurthyNumber {
    //A Krishnamurthy number is a number whose sum of the factorial of digits is equal to the number itself.

    public static boolean isKrishnamurthyNumber(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            sum += Factorial.get(temp % 10);
            temp /= 10;
        }

        return sum == num;
    }
}
