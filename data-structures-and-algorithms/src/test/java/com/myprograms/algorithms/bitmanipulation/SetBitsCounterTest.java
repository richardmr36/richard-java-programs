package com.myprograms.algorithms.bitmanipulation;

import com.myprograms.algorithms.bitmanipulation.SetBitsCounter;
import org.junit.Assert;
import org.junit.Test;

public class SetBitsCounterTest {

    @Test
    public void countNoOfSetBits() {
        int num = 4;
        int expected = 1;
        Assert.assertEquals(expected, SetBitsCounter.countUsingBrianKernighanAlgorithm(num));
        Assert.assertEquals(expected, SetBitsCounter.countIterativelyWithRightShift(num));
        Assert.assertEquals(expected, SetBitsCounter.countIterativelyWithLeftShift(num));
        Assert.assertEquals(expected, SetBitsCounter.countRecursively(num));
    }
}