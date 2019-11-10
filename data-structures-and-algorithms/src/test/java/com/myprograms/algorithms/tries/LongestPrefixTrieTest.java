package com.myprograms.algorithms.tries;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPrefixTrieTest {

    @Test
    public void findLongestPrefix() {
        LongestPrefixTrie dict = new LongestPrefixTrie();
        dict.insert("are");
        dict.insert("area");
        dict.insert("base");
        dict.insert("cat");
        dict.insert("cater");
        dict.insert("basement");

        String input = "caterer";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));

        input = "basement";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));

        input = "are";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));

        input = "arex";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));

        input = "basemexz";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));

        input = "xyz";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));
    }
}