package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatedCharFinderTest {

    @Test
    public void testFind() {
        Assert.assertEquals('r', FirstNonRepeatedCharFinder.find("teeter"));
    }
}