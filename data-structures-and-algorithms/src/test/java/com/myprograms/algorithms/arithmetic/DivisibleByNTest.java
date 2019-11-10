package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisibleByNTest {

    @Test
    public void isDivisibleBy11() {
        Assert.assertTrue(DivisibleByN.isDivisibleBy11(2728 ));
        Assert.assertFalse(DivisibleByN.isDivisibleBy11(31415 ));
    }
}