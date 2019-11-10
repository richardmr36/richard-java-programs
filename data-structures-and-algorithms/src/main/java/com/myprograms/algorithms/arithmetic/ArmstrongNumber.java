package com.myprograms.algorithms.arithmetic;

public class ArmstrongNumber {

    //Armstrong number is a number that is equal to the sum of cubes of its digits.
    //0, 1, 153, 370, 371, 407 etc. For example 153 = 1^3 + 5^3 +3^3

    public static boolean isArmstrong(int num) {
        int remainder, sum = 0, temp = num;
        while (num > 0) {
            remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            num = num / 10;
        }
        return sum == temp;
    }
}
