package com.myprograms.algorithms.strings;

public class Abecedarian {
    //An Abecadrian is a word where each letter is in alphabetical order

    public static boolean isAbecedarian(String str) {
        for (int i = 1; i < str.length(); i++)
            if (str.charAt(i - 1) > str.charAt(i))
                return false;

        return true;
    }
}
