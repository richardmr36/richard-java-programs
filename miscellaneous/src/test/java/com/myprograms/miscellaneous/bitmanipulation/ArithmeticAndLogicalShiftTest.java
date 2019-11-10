package com.myprograms.miscellaneous.bitmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticAndLogicalShiftTest {

    @Test
    public void arithmeticRightShift() {
        System.out.println(new ArithmeticAndLogicalShift().arithmeticRightShift(-23,1));
    }

    @Test
    public void logicalRightShift() {
        System.out.println(new ArithmeticAndLogicalShift().logicalRightShift(23,1));
    }

    @Test
    public void arithmeticLeftShift() {
        System.out.println(new ArithmeticAndLogicalShift().arithmeticLeftShift(23,1));
    }
}