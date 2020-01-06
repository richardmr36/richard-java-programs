package com.myprograms.algorithms.stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StackWithGetMaxTest {

    @Test
    public void testGetMax() {
        StackWithGetMax stack = new StackWithGetMax();
        stack.push(3);
        stack.push(5);
        Assert.assertEquals(5, stack.getMax());
        stack.push(7);
        stack.push(9);
        Assert.assertEquals(9, stack.getMax());
        Assert.assertEquals(9, stack.pop());
        Assert.assertEquals(7, stack.getMax());
        Assert.assertEquals(7, stack.pop());
        Assert.assertEquals(5, stack.pop());
    }
}