package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestSubstringOfGivenCharsTest {

    @Test
    public void test1() {
        String subject = "this is a test string";
        String textToBeFound = "tst";
        System.out.println(SmallestSubstringOfGivenChars.getSubstringUsingSingleMap(textToBeFound.toCharArray(), subject));
        System.out.println(SmallestSubstringOfGivenChars.getSubstringUsingDoubleMap(textToBeFound.toCharArray(), subject));
        System.out.println(SmallestSubstringOfGivenChars.findSubString(subject, textToBeFound));
        System.out.println();

        subject = "geeksforgeeks";
        textToBeFound = "ork";
        System.out.println(SmallestSubstringOfGivenChars.getSubstringUsingSingleMap(textToBeFound.toCharArray(), subject));
        System.out.println(SmallestSubstringOfGivenChars.getSubstringUsingDoubleMap(textToBeFound.toCharArray(), subject));
        System.out.println(SmallestSubstringOfGivenChars.findSubString(subject, textToBeFound));
    }
}