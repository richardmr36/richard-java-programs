package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringReverserTest {

    @Test
    public void reverseStringWithoutAffectingSpecialChars() {
        Assert.assertEquals("d!@cb&a", StringReverser.reverseStringWithoutAffectingSpecialChars("a!@bc&d"));
    }
}