package com.myprograms.algorithms.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterCounterTest {

    @Test
    public void countUsingRegularExpressions() {
        String word = "elephant";
        String regex = "[^e]*e";
        int noOfChar = 2;
        assertEquals("Wrong count", noOfChar, CharacterCounter.countUsingRegularExpressions(word, regex));
    }

    @Test
    public void countUsingLambda() {
        String word = "elephant";
        char c = 'e';
        int noOfChar = 2;
        assertEquals("Wrong count", noOfChar, CharacterCounter.countUsingLambda(word, c));
    }

    @Test
    public void countTotalChars() {
        assertEquals(8, CharacterCounter.countTotalChars("elephant"));
    }
}