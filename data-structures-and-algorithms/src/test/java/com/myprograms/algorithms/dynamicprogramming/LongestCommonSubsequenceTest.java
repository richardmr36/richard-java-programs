package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void findLongestCommonSubsequenceUsingRecursion() {
        Assert.assertEquals(4, LongestCommonSubsequence.findLongestCommonSubsequenceUsingRecursion("AGGTAB","GXTXAYB"));
    }

    @Test
    public void findLongestCommonSubsequenceUsingMemoization() {
        Assert.assertEquals(4, LongestCommonSubsequence.findLongestCommonSubsequenceUsingMemoization("AGGTAB","GXTXAYB"));
    }

    @Test
    public void findLongestCommonSubsequenceUsingDp() {
        Assert.assertEquals(4, LongestCommonSubsequence.findLongestCommonSubsequenceUsingDp("AGGTAB","GXTXAYB"));
    }
}