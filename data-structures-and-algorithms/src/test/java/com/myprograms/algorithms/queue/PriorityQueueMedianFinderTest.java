package com.myprograms.algorithms.queue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PriorityQueueMedianFinderTest {

    @Test
    public void getMedians() {
        int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PriorityQueueMedianFinder medianFinder = new PriorityQueueMedianFinder();
        double[] result = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
        assertArrayEquals("Medians are wrong", result, medianFinder.getMediansSimpler(items), 0);
        assertArrayEquals("Medians are wrong", result, medianFinder.getMedians(items), 0);
    }
}