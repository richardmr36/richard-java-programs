package com.myprograms.algorithms.dynamicprogramming;

public class LongestCommonSubsequence {
    public static int findLongestCommonSubsequenceUsingRecursion(String str1, String str2) {
        return findLongestCommonSubsequenceUsingRecursion(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length());
    }

    private static int findLongestCommonSubsequenceUsingRecursion(char[] chars1, char[] chars2, int m, int n) {
        if (m == 0 || n == 0)
            return 0;

        if (chars1[m - 1] == chars2[n - 1])
            return 1 + findLongestCommonSubsequenceUsingRecursion(chars1, chars2, m - 1, n - 1);
        else
            return Math.max(findLongestCommonSubsequenceUsingRecursion(chars1, chars2, m - 1, n),
                    findLongestCommonSubsequenceUsingRecursion(chars1, chars2, m, n - 1));

    }

    public static int findLongestCommonSubsequenceUsingMemoization(String str1, String str2) {
        return findLongestCommonSubsequenceUsingMemoization(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length(), new int[str1.length()][str2.length()]);
    }

    private static int findLongestCommonSubsequenceUsingMemoization(char[] chars1, char[] chars2, int m, int n, int[][] memo) {
        if (m == 0 || n == 0)
            return 0;

        if (memo[m - 1][n - 1] == 0) {
            if (chars1[m - 1] == chars2[n - 1]) {
                memo[m - 1][n - 1] = 1 + findLongestCommonSubsequenceUsingMemoization(chars1, chars2, m - 1, n - 1, memo);
            } else {
                memo[m - 1][n - 1] = Math.max(findLongestCommonSubsequenceUsingRecursion(chars1, chars2, m - 1, n),
                        findLongestCommonSubsequenceUsingRecursion(chars1, chars2, m, n - 1));
            }
        }

        return memo[m - 1][n - 1];
    }

    public static int findLongestCommonSubsequenceUsingDp(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int[][] LCS = new int[m + 1][n + 1];
        LCS[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (chars1[i - 1] == chars2[j - 1])
                    LCS[i][j] = 1 + LCS[i - 1][j - 1];
                else
                    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
            }
        }

        return LCS[m][n];
    }
}
