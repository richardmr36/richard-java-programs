package com.myprograms.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class WordLadderTest {

    @Test
    public void testFindMinLengthOfChainToConvertSourceToTargetUsingBFS() {
        String[] dictionary = {"cat", "rat", "hat", "sag", "bag", "bug", "dog", "hog", "hot", "dot",
                "rot", "lot", "log", "cry", "pry", "fry", "fat", "fog", "pot", "fat"};

        Assert.assertEquals(5, WordLadder.findMinLengthOfChainToConvertSourceToTargetUsingBFS("cat", "dog", dictionary));
    }

    @Test
    public void testFindMinLengthOfChainToConvertSourceToTargetUsingBidirectionalBFS() {
        String[] dictionary = {"POON", "PLEE", "SAME", "POIE", "PLEA", "PLIE", "POIN"};
        Assert.assertEquals(7, WordLadder.findMinLengthOfChainToConvertSourceToTargetUsingBidirectionalBFS("TOON", "PLEA", dictionary));
    }

    @Test
    public void testGetMinPathToConvertSourceToTarget() {
        String[] dictionary = {"cat", "rat", "hat", "sag", "bag", "bug", "dog", "hog", "hot", "dot",
                "rot", "lot", "log", "cry", "pry", "fry", "fat", "fog", "pot", "fat"};

        String expected = "cat->hat->hot->dot->dog";
        Assert.assertEquals(expected, WordLadder.getMinPathToConvertSourceToTarget("cat", "dog", dictionary));
    }
}