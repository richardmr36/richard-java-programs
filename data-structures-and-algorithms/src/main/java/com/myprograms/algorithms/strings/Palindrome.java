package com.myprograms.algorithms.strings;

import com.myprograms.algorithms.dynamicprogramming.LongestCommonSubsequence;

public class Palindrome {
    public static int getNoOfSpecialPalindromeSubstrings(String str) {
        int count = str.length();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j < str.length() + 1; j++) {
                if (isSpecialPalindrome(str.substring(i, j)))
                    count++;
            }
        }

        return count;
    }

    private static boolean isSpecialPalindrome(String substring) {
        char first = substring.charAt(0);

        if (substring.length() == 2 && substring.charAt(1) != first)
            return false;

        for (int i = 1; i < substring.length(); i++) {
            if (first == substring.charAt(i))
                continue;

            if (i != (substring.length() / 2))
                return false;
        }

        return true;
    }

    public static int findMinNoOfInsertionsToFormPalindromeUsingRecursion(String str) {
        return Palindrome.findMinNoOfInsertionsToFormPalindromeUsingRecursion(str, 0, str.length() - 1);
    }

    private static int findMinNoOfInsertionsToFormPalindromeUsingRecursion(String str, int left, int right) {
        if (left > right) return -1;
        if (left == right) return 0;
        boolean isCharAtLeftSameAsCharAtRight = str.charAt(left) == str.charAt(right);
        if (left == right - 1) return (isCharAtLeftSameAsCharAtRight ? 0 : 1);

        return isCharAtLeftSameAsCharAtRight ?
                findMinNoOfInsertionsToFormPalindromeUsingRecursion(str, left + 1, right - 1) :
                Integer.min(
                        findMinNoOfInsertionsToFormPalindromeUsingRecursion(str, left + 1, right),
                        findMinNoOfInsertionsToFormPalindromeUsingRecursion(str, left, right - 1)
                ) + 1;
    }

    public static int findMinNoOfInsertionsToFormPalindromeUsingLCS(String str) {
        int n = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        int lcs = LongestCommonSubsequence.findLongestCommonSubsequenceUsingDp(str, stringBuilder.reverse().toString());
        return n - lcs;
    }

    public static int findMinNoOfInsertionsToFormPalindromeUsingDP(String str) {
        int n = str.length();
        int[][] dpTable = new int[n][n];

        for (int gap = 1; gap < n; gap++) {
            for (int left = 0, right = gap; right < n; left++, right++) {
                dpTable[left][right] = str.charAt(left) == str.charAt(right) ? dpTable[left + 1][right - 1] :
                        Integer.min(dpTable[left + 1][right], dpTable[left][right - 1]) + 1;
            }
        }

        return dpTable[0][n - 1];
    }
}
