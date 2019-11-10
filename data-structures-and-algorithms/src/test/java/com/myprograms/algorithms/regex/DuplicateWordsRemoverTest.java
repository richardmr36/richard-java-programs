package com.myprograms.algorithms.regex;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateWordsRemoverTest {

    @Test
    public void removeDuplicateWordsFromSentence() {
        final String sentence = "Reya is is the the best player in eye eye game";
        final String correctedSentence = "Reya is the best player in eye game";
        assertEquals("Duplicates are not removed", correctedSentence, new DuplicateWordsRemover().removeDuplicateWordsFromSentence(sentence));
    }
}