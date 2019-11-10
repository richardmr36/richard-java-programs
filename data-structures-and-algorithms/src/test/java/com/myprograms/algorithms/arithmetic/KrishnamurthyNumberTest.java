package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class KrishnamurthyNumberTest {

    @Test
    public void isKrishnamurthyNumber() {
        Assert.assertTrue(KrishnamurthyNumber.isKrishnamurthyNumber(40585));
        Assert.assertTrue(KrishnamurthyNumber.isKrishnamurthyNumber(145));
    }
}