package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HighestPowerOfTwoThatIsLessThanOrEqualToNTest {

    @Test
    public void determine() {
        Assert.assertEquals(256, HighestPowerOfTwoThatIsLessThanOrEqualToN.determine(256));
        Assert.assertEquals(512, HighestPowerOfTwoThatIsLessThanOrEqualToN.determine(555));
    }
}