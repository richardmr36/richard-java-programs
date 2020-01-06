package com.myprograms.algorithms.stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TwoStacksInSingleArrayTest {

    @Test
    public void testTwoStacks() {
        TwoStacksInSingleArray twoStacksInSingleArray = new TwoStacksInSingleArray(5);
        twoStacksInSingleArray.pushToFirstStack(5);
        twoStacksInSingleArray.pushToSecondStack(10);
        twoStacksInSingleArray.pushToSecondStack(15);
        twoStacksInSingleArray.pushToFirstStack(11);
        twoStacksInSingleArray.pushToSecondStack(7);
        Assert.assertEquals(11, twoStacksInSingleArray.popFromFirstStack());
        twoStacksInSingleArray.pushToSecondStack(40);
        Assert.assertEquals(40, twoStacksInSingleArray.popFromSecondStack());
    }
}