package com.myprograms.algorithms.strings;

import java.math.BigInteger;
import java.util.Random;

public class StringMatcher {
    public static int bruteForceMethod(String subject, String pattern) {
        int subjectLength = subject.length();
        int patternLength = pattern.length();

        for (int i = 0; i < subjectLength - patternLength; i++) {
            int j = 0;
            while (j < patternLength && subject.charAt(i + j) == pattern.charAt(j))
                j++;

            if (j == patternLength)
                return i;
        }

        return -1;
    }

    public static int rabinKarpMethod(String subject, String pattern) {
        int bitLength = 31;
        int maxCharsInInput = 256;
        long longPrime = BigInteger.probablePrime(bitLength, new Random()).longValue();

        int subjectLength = subject.length();
        int patternLength = pattern.length();
        long patternHash = generateHash(pattern, longPrime, pattern.length(), maxCharsInInput);

        long subjectHash = generateHash(subject, longPrime, patternLength, maxCharsInInput);
        if (subjectHash == patternHash && isAllCharsMatching(subject, 0, pattern))
            return 0;

        //pre-compute R^(M-1) % Q for use in removing leading char
        long removeLeadingChar = 1;
        for (int i = 0; i < patternLength - 1; i++)
            removeLeadingChar = (maxCharsInInput * removeLeadingChar) % longPrime;

        for (int i = patternLength; i < subjectLength; i++) {
            // Remove leading digit, add trailing digit, check for match.
            subjectHash = (subjectHash + longPrime - removeLeadingChar * subject.charAt(i - patternLength) % longPrime) % longPrime;
            subjectHash = (subjectHash * maxCharsInInput + subject.charAt(i)) % longPrime;

            int offset = i - patternLength + 1;
            if (subjectHash == patternHash && isAllCharsMatching(subject, offset, pattern))
                return offset;
        }

        return -1;

    }


    private static boolean isAllCharsMatching(String subject, int startOffset, String pattern) {
        for (int i = 0; i < pattern.length(); i++)
            if (pattern.charAt(i) != subject.charAt(startOffset + i))
                return false;

        return true;
    }

    private static long generateHash(String str, long longPrime, int length, int radix) {
        long hash = 0;
        for (int i = 0; i < length; i++)
            hash = (radix * hash + str.charAt(i)) % longPrime;

        return hash;
    }

    public static int knuthMorrisPrattMethod(String subject, String pattern) {
        int subjectLength = subject.length();
        int patternLength = pattern.length();
        int[] nextTable = preProcess(pattern);

        int i = 0, j = 0;

        while (j < subjectLength) {
            while (i > -1 && pattern.charAt(i) != subject.charAt(j))
                i = nextTable[i];

            i++;
            j++;

            if (i >= patternLength)
                return j - i;
        }

        return -1;
    }

    private static int[] preProcess(String pattern) {
        int patternLength = pattern.length();
        int[] nextTable = new int[patternLength + 1];

        int i = 0;
        int j = nextTable[0] = -1;

        while (i < patternLength) {
            while (j > -1 && pattern.charAt(i) != pattern.charAt(j))
                j = nextTable[j];

            nextTable[++i] = ++j;
        }

        return nextTable;
    }
}
