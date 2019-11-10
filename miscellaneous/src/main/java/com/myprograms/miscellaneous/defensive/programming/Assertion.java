package com.myprograms.miscellaneous.defensive.programming;

public class Assertion {
    /*https://www.geeksforgeeks.org/assertions-in-java/*/

    public static void main(String[] args) {
        int f = -5;

        System.out.println("f value "+f);
        assert (f>0) : "Assertion failed: f is actually negative";
    }
}
