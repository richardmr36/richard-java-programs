package com.myprograms.algorithms.strings;

public class CaseConverter {
    public static String convertToLowerCaseWithoutUsingBuiltInMethod(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 64 && ch < 91)
                ch += 32;

            chars[i] = ch;
        }

        return String.valueOf(chars);
    }

    public static String convertToUpperCaseWithoutUsingBuiltInMethod(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 96 && ch < 123)
                ch -= 32;

            chars[i] = ch;
        }

        return String.valueOf(chars);
    }
}
