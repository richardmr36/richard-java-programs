package com.myprograms.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void testNoOfCharToBeDeletedToMakeTwoStringsAnagram() {
        final String str1 = "cddgk";
        final String str2 = "gcd";
        Assert.assertEquals(2, Anagram.noOfCharToBeDeletedToMakeTwoStringsAnagram(str1, str2));
    }

    @Test
    public void testIsAnagram() {
        final String str1 = "abc";
        final String str2 = "bca";
        Assert.assertTrue(Anagram.isAnagram_method1(str1, str2));
        Assert.assertTrue(Anagram.isAnagram_method2(str1, str2));
    }
}