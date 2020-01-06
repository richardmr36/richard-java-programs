package com.myprograms.algorithms.stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class KStacksInSingleArrayTest {

    @Test
    public void testKStacks() {
        KStacksInSingleArray kStacksInSingleArray = new KStacksInSingleArray(   10, 3);
        kStacksInSingleArray.push(15, 2);
        kStacksInSingleArray.push(45, 2);
        kStacksInSingleArray.push(17, 1);
        kStacksInSingleArray.push(49, 1);
        kStacksInSingleArray.push(39, 1);
        kStacksInSingleArray.push(11, 0);
        kStacksInSingleArray.push(9, 0);
        kStacksInSingleArray.push(7, 0);

        Assert.assertEquals(45, kStacksInSingleArray.pop(2));
        Assert.assertEquals(39, kStacksInSingleArray.pop(1));
        Assert.assertEquals(7, kStacksInSingleArray.pop(0));
    }
}