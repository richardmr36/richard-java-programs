package com.myprograms.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class SubstringProblemsTest {

    @Test
    public void findLongestSubstringWithKUniqueChars() {
        Assert.assertEquals("bdbdbbd", SubstringProblems.findLongestSubstringWithKUniqueChars("abcbdbdbbdcdabd", 2));
    }

    @Test
    public void findSmallestSubstringOfAllCharsPresent() {
        Assert.assertEquals("dbca", SubstringProblems.findSmallestSubstringOfAllCharsPresent("aabcbcdbca"));
    }
}