package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistanceTest {

    @Test
    public void calculateEditDistanceUsingRecursion() {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(new EditDistance().calculateEditDistanceUsingRecursion(str1,str2,str1.length(),str2.length()));
    }

    @Test
    public void calculateEditDistanceUsingDp() {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(new EditDistance().calculateEditDistanceUsingDp(str1,str2,str1.length(),str2.length()));
    }
}