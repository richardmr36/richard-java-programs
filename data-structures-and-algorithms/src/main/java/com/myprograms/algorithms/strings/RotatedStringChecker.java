package com.myprograms.algorithms.strings;

public class RotatedStringChecker {
    public static boolean isRotatedString(String actualString, String rotatedString) {
        if(actualString.length() != rotatedString.length())
            return false;

        String concatenated = rotatedString + rotatedString;
        return concatenated.contains(actualString);
    }
}
