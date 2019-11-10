package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestSubstringOfAllCharsPresentTest {

    @Test
    public void test() {
        String str = "aabcbcdbca";
        System.out.println(SmallestSubstringOfAllCharsPresent.findSubString(str));
    }
}