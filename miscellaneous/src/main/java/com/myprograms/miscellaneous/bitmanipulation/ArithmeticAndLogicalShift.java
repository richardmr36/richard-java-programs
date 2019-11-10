package com.myprograms.miscellaneous.bitmanipulation;

public class ArithmeticAndLogicalShift {
    public int logicalRightShift(int n, int shift) {
        return n >>> shift;
    }

    public int arithmeticRightShift(int n, int shift) {
        return n >> shift;
    }

    public int arithmeticLeftShift(int n, int shift) {
        return n << shift;
    }
}
