package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AbecedarianTest {

    @Test
    public void isAbecedarian() {
        Assert.assertTrue(Abecedarian.isAbecedarian("biopsy"));
        Assert.assertFalse(Abecedarian.isAbecedarian("abecedarian"));
    }
}