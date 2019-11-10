package com.myprograms.algorithms.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordCounterTest {

    @Test
    public void noOfWordsInCamelCaseWord() {
        String camelCaseWord = "saveChangesInTheEditor";
        int expectedNoOfWords = 5;
        assertEquals("No of words is wrong", expectedNoOfWords, WordCounter.countNoOfWordsInCamelCaseWord(camelCaseWord));
    }

    @Test
    public void countNoOfWords() {
        String sentence = "save changes in the Editor";
        int expectedNoOfWords = 5;
        assertEquals("No of words is wrong", expectedNoOfWords, WordCounter.countNoOfWords(sentence));
    }
}