package com.myprograms.algorithms.strings;

public class Palindrome {
    public int getNoOfSpecialPalindromeSubstrings(String str) {
        int count = str.length();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j < str.length()+1; j++) {
                if (isSpecialPalindrome(str.substring(i, j)))
                    count++;
            }
        }

        return count;
    }

    private boolean isSpecialPalindrome(String substring) {
        char first = substring.charAt(0);

        if(substring.length() == 2 && substring.charAt(1) != first)
            return false;

        for (int i = 1; i < substring.length(); i++) {
            if (first == substring.charAt(i))
                continue;

            if (i != (substring.length() / 2))
                return false;
        }

        return true;
    }
}
