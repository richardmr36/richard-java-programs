package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntConverterTest {

    @Test
    public void convertWithoutUsingBuiltInMethod() {
        Assert.assertEquals(123456, StringToIntConverter.convertWithoutUsingBuiltInMethod("123456"));
        Assert.assertEquals(-98765443, StringToIntConverter.convertWithoutUsingBuiltInMethod("-98765443"));
    }
}