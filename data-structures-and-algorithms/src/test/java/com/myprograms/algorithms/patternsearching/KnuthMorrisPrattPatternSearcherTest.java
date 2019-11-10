package com.myprograms.algorithms.patternsearching;

import org.junit.Assert;
import org.junit.Test;

public class KnuthMorrisPrattPatternSearcherTest {

    @Test
    public void search() {
        String str = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        int[] expectedArray = {0, 9, 13};
        Assert.assertArrayEquals(expectedArray, KnuthMorrisPrattPatternSearcher.search(str, pattern));
    }
}