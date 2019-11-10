package com.myprograms.algorithms.stack;

import org.junit.Assert;
import org.junit.Test;

public class OverlappingIntervalsTest {

    @Test
    public void mergeOverlappingIntervalsUsingStack() {
        Interval[] intervals = {
                new Interval(4, 7),
                new Interval(-1, 5),
                new Interval(3, 6),
                new Interval(9, 11)
        };

        Interval[] expectedIntervals = {
                new Interval(-1, 7),
                new Interval(9, 11)
        };

        Assert.assertArrayEquals(expectedIntervals, OverlappingIntervals.mergeOverlappingIntervalsUsingStack(intervals));
    }

    @Test
    public void mergeOverlappingIntervals() {
        Interval[] intervals = {
                new Interval(4, 7),
                new Interval(-1, 5),
                new Interval(3, 6),
                new Interval(9, 11)
        };

        Interval[] expectedIntervals = {
                new Interval(-1, 7),
                new Interval(9, 11)
        };

        Assert.assertArrayEquals(expectedIntervals, OverlappingIntervals.mergeOverlappingIntervals(intervals));
    }
}