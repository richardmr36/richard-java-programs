package com.myprograms.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PangramTest {

    @Test
    public void checkForPangram() {
        Pangram pangram = new Pangram();
        String sentence = "We promptly judged antique ivory buckles for the next prize";
        assertTrue("It is not a pangram", pangram.checkForPangram(sentence));
    }
}