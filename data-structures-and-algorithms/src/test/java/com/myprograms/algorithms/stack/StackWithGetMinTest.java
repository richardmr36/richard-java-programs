package com.myprograms.algorithms.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackWithGetMinTest {

    @Test
    public void testGetMin() {
        StackWithGetMin stack = new StackWithGetMin();
        stack.push(3);
        stack.push(5);
        Assert.assertEquals(3, stack.getMin());
        stack.push(2);
        stack.push(1);
        Assert.assertEquals(1, stack.getMin());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(2, stack.getMin());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(5, stack.pop());
    }
}