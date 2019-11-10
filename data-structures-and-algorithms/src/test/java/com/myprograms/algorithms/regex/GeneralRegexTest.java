package com.myprograms.algorithms.regex;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralRegexTest {

    @Test
    public void matchUsername() {
        final String username = "Samantha_21";
        assertTrue("Not a valid username",new GeneralRegex().matchUsername(username));
    }


}