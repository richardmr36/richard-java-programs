package com.myprograms.algorithms.bitmanipulation;

//https://www.geeksforgeeks.org/efficiently-find-first-repeated-character-string-without-using-additional-data-structure-one-traversal/

public class FirstRepeatedCharFinder {
    public static char find(String str) {
        // An integer to store presence/absence of 26 characters using its 32 bits.
        int checker = 0;

        for (int i = 0; i < str.length(); ++i) {
            int val = (str.charAt(i) - 'a');

            // If bit corresponding to current character is already set
            if ((checker & (1 << val)) > 0)
                return str.charAt(i);

            // set bit in checker
            checker |= (1 << val);
        }

        return '-';
    }
}
