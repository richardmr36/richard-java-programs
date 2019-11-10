package com.myprograms.algorithms.strings;

public class StringToIntConverter {
    public static int convertWithoutUsingBuiltInMethod(String str) {
        int num = 0, i = 0;
        boolean isNegative = false;

        if ('-' == str.charAt(0)) {
            i++;
            isNegative = true;
        }

        for (; i < str.length(); i++) {
            num *= 10;
            num += (str.charAt(i) - '0');
        }

        if (isNegative)
            return -num;

        return num;
    }
}
