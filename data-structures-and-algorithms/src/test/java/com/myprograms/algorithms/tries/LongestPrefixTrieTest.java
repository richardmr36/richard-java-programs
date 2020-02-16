package com.myprograms.algorithms.tries;

import org.junit.Assert;
import org.junit.Test;

public class LongestPrefixTrieTest {

    @Test
    public void findLongestPrefix() {
        String[] arr = {"are", "area", "base", "cat", "cater", "basement"};
        LongestPrefixTrie dict = new LongestPrefixTrie(arr);

        Assert.assertEquals("cater", dict.getMatchingPrefix("caterer"));
        Assert.assertEquals("basement", dict.getMatchingPrefix("basement"));
        Assert.assertEquals("are", dict.getMatchingPrefix("are"));
        Assert.assertEquals("are", dict.getMatchingPrefix("arez"));
        Assert.assertEquals("", dict.getMatchingPrefix("xyz"));
        Assert.assertEquals("base", dict.getMatchingPrefix("basemont"));
    }
}