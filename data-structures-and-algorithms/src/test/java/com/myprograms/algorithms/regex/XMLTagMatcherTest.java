package com.myprograms.algorithms.regex;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class XMLTagMatcherTest {

    @Ignore
    @Test
    public void getTagValues() {
        final String str = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        final String data = "Sanjay has no watch";
        assertEquals("Data is wrong", data, new XMLTagMatcher().getTagValues(str));
    }
}