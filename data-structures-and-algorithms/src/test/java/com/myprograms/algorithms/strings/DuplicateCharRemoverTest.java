package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateCharRemoverTest {

    @Test
    public void removeDuplicateCharWithoutAdditionalArray() {
        assertEquals("abcde", DuplicateCharRemover.removeDuplicateCharWithoutAdditionalArray("abcbded"));
        assertEquals("a", DuplicateCharRemover.removeDuplicateCharWithoutAdditionalArray("aaaaa"));
    }
}