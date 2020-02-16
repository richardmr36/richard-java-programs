package com.myprograms.algorithms.strings;

import java.util.Arrays;

public class Anagram {
    public static int NUMBER_OF_ALPHABETS = 26;
    public static int NUMBER_OF_ASCII_CHAR = 1 << 8; //256

    public static boolean isAnagram_method1(String str1, String str2) {
        return sortedString(str1).equalsIgnoreCase(sortedString(str2));
    }

    public static boolean isAnagram_method2(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] letters = new int[NUMBER_OF_ASCII_CHAR];
        for (char c : str1.toCharArray())
            letters[c]++;

        for (char c : str2.toCharArray()) {
            letters[c]--;
            if(letters[c] < 0)
                return false;
        }

        return true;
    }

    private static String sortedString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static int noOfCharToBeDeletedToMakeTwoStringsAnagram(String str1, String str2) {
        int[] charCount1 = getCharCount(str1);
        int[] charCount2 = getCharCount(str2);

        return getDelta(charCount1, charCount2);
    }

    private static int getDelta(int[] charCount1, int[] charCount2) {
        if (charCount1.length != charCount2.length) {
            return -1;
        }
        int delta = 0;
        for (int i = 0; i < NUMBER_OF_ALPHABETS; i++) {
            delta += Math.abs(charCount1[i] - charCount2[i]);
        }
        return delta;
    }

    private static int[] getCharCount(String str) {
        int[] charCount = new int[NUMBER_OF_ALPHABETS];
        int offset = 'a';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c - offset]++;
        }
        return charCount;
    }
}
