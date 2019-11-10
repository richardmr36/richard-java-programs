package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void findLongestCommonSubsequenceUsingRecursion() {
        System.out.println(new LongestCommonSubsequence().findLongestCommonSubsequenceUsingRecursion("AGGTAB","GXTXAYB"));
    }

    @Test
    public void findLongestCommonSubsequenceUsingMemoization() {
        System.out.println(new LongestCommonSubsequence().findLongestCommonSubsequenceUsingMemoization("AGGTAB","GXTXAYB"));
    }

    @Test
    public void findLongestCommonSubsequenceUsingDp() {
        System.out.println(new LongestCommonSubsequence().findLongestCommonSubsequenceUsingDp("AGGTAB","GXTXAYB"));
    }
}