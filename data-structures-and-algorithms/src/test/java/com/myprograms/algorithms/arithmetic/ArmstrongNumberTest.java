package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumberTest {

    @Test
    public void isArmstrong() {
        Assert.assertTrue(ArmstrongNumber.isArmstrong(153));
        Assert.assertFalse(ArmstrongNumber.isArmstrong(353));
    }
}