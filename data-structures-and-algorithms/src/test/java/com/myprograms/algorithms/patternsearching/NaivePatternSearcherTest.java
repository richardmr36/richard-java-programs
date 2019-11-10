package com.myprograms.algorithms.patternsearching;

import org.junit.Assert;
import org.junit.Test;

public class NaivePatternSearcherTest {

    @Test
    public void search() {
        String str = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        int[] expectedArray = {0, 9, 13};
        Assert.assertArrayEquals(expectedArray, NaivePatternSearcher.search(str, pattern));
    }

    @Test
    public void optimizedSearchWhenPatternHasUniqueChars() {
        String str = "ABCEABCDABCEABCD";
        String pattern = "ABCD";
        int[] expectedArray = {4, 12};
        Assert.assertArrayEquals(expectedArray, NaivePatternSearcher.optimizedSearchWhenPatternHasUniqueChars(str, pattern));
    }
}