package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharStringCheckerTest {

    @Test
    public void isUnique() {
        assertTrue(UniqueCharStringChecker.isUniqueWithLowerCase("abcd"));
        assertFalse(UniqueCharStringChecker.isUniqueWithLowerCase("abcdb"));

        assertTrue(UniqueCharStringChecker.isUnique("aBCd"));
        assertTrue(UniqueCharStringChecker.isUnique("aBcDb"));
    }
}