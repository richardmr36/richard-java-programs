package com.myprograms.algorithms.strings;

public class DuplicateCharRemover {
    public static String removeDuplicateCharWithoutAdditionalArray(String str) {
        if (str == null)
            return null;

        if (str.length() < 2)
            return str;

        char[] charArray = str.toCharArray();

        int tail = 1;
        for (int i = 0, j; i < charArray.length; i++) {
            for (j = 0; j < tail; j++)
                if (charArray[i] == charArray[j])
                    break;

            if (j == tail)
                charArray[tail++] = charArray[i];
        }

        return String.valueOf(charArray).substring(0, tail);
    }
}
