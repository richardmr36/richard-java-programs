package com.myprograms.algorithms.geometric;

import org.junit.Assert;
import org.junit.Test;

public class ClockAngleFinderTest {

    @Test
    public void findAngle() {
        Assert.assertEquals(85, ClockAngleFinder.findAngle(11, 10), 0.1);
    }
}