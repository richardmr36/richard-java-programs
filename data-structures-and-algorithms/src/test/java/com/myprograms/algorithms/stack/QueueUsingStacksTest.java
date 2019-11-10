package com.myprograms.algorithms.stack;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class QueueUsingStacksTest {

    @Test
    public void checkQueue() {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(e -> queue.enqueue(e));

        int[] expected = {1, 2, 3, 4};
        for (int i : expected)
            Assert.assertEquals(Integer.valueOf(i), queue.dequeue());
    }
}