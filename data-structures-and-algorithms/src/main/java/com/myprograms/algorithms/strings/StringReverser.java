package com.myprograms.algorithms.strings;

import com.myprograms.algorithms.utility.ArrayUtility;

public class StringReverser {
    public static String reverseStringWithoutAffectingSpecialChars(String str) {
        int n = str.length();
        char[] charArray = str.toCharArray();
        int l = 0, r = n - 1;
        while (l < r) {
            if(!Character.isAlphabetic(charArray[l]))
                l++;
            else if(!Character.isAlphabetic(charArray[r]))
                r--;
            else {
                ArrayUtility.swap(charArray, l++, r--);
            }
        }

        return String.valueOf(charArray);
    }
}
