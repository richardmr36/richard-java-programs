package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CaseConverterTest {

    private static final String UPPERCASE_ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    @Test
    public void testConvertToUpperCase() {
        Assert.assertEquals(LOWERCASE_ALPHABETS,
                CaseConverter.convertToLowerCaseWithoutUsingBuiltInMethod(UPPERCASE_ALPHABETS));
    }

    @Test
    public void testConvertToLowerCase() {
        Assert.assertEquals(UPPERCASE_ALPHABETS,
                CaseConverter.convertToUpperCaseWithoutUsingBuiltInMethod(LOWERCASE_ALPHABETS));
    }
}