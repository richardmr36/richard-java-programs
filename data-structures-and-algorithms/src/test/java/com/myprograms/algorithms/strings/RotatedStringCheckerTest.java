package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotatedStringCheckerTest {

    @Test
    public void isRotatedString() {
        String actualString = "apple";
        String rotatedString = "pleap";
        assertTrue(RotatedStringChecker.isRotatedString(actualString, rotatedString));
    }
}