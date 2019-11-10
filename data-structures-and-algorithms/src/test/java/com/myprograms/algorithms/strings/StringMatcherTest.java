package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMatcherTest {

    @Test
    public void testCase1() {
        assertEquals(4, StringMatcher.bruteForceMethod("hello world", "o wo"));
        assertEquals(4, StringMatcher.rabinKarpMethod("hello world", "o wo"));
        assertEquals(4, StringMatcher.knuthMorrisPrattMethod("hello world", "o wo"));
    }

    @Test
    public void testCase2() {
        assertEquals(9, StringMatcher.bruteForceMethod("abcd abccabca b", "abca"));
        assertEquals(9, StringMatcher.rabinKarpMethod("abcd abccabca b", "abca"));
        assertEquals(9, StringMatcher.knuthMorrisPrattMethod("abcd abccabca b", "abca"));
    }
}