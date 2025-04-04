package com.myprograms.miscellaneous.lambdas;

interface NumericTest {
    boolean computeTest(int n);
}

public class NumberCheck {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));
    }
}
