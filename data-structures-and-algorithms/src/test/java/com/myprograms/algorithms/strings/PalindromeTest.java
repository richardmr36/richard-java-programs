package com.myprograms.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void getNoOfSpecialPalindromeSubstrings() {
        Assert.assertEquals(7, Palindrome.getNoOfSpecialPalindromeSubstrings("asasd"));
    }

    @Test
    public void findMinNoOfInsertionsToFormPalindromeUsingRecursion() {
        String str = "abcda";
        int expected = 2;
        Assert.assertEquals(expected, Palindrome.findMinNoOfInsertionsToFormPalindromeUsingRecursion(str));
    }

    @Test
    public void findMinNoOfInsertionsToFormPalindromeUsingLCS() {
        String str = "abcda";
        int expected = 2;
        Assert.assertEquals(expected, Palindrome.findMinNoOfInsertionsToFormPalindromeUsingLCS(str));
    }

    @Test
    public void findMinNoOfInsertionsToFormPalindromeUsingDP() {
        String str = "abcda";
        int expected = 2;
        Assert.assertEquals(expected, Palindrome.findMinNoOfInsertionsToFormPalindromeUsingDP(str));
    }
}