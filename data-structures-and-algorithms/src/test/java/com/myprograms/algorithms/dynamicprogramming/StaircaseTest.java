package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseTest {

    @Test
    public void noOfWaysOneCanClimbStaircaseIn123Steps() {
        System.out.println(new Staircase().noOfWaysOneCanClimbStaircaseIn123Steps(4));
        System.out.println(new Staircase().countWaysWithoutDP(4));
    }
}