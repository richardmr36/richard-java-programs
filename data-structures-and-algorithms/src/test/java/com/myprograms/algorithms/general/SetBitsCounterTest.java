package com.myprograms.algorithms.general;

import org.junit.Assert;
import org.junit.Test;

public class SetBitsCounterTest {

    @Test
    public void countNoOfSetBits() {
        int num = 4;
        int expected = 1;
        Assert.assertEquals(expected, SetBitsCounter.countUsingBrianKernighanAlgorithm(num));
        Assert.assertEquals(expected, SetBitsCounter.countIteratively(num));
        Assert.assertEquals(expected, SetBitsCounter.countRecursively(num));
    }
}