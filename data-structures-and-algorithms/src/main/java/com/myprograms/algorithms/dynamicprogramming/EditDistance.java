package com.myprograms.algorithms.dynamicprogramming;

public class EditDistance {

    /*https://geeksforgeeks.org/dynamic-programming-set-5-edit-distance/*/

    public int calculateEditDistanceUsingRecursion(String str1, String str2, int m, int n) {
        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return calculateEditDistanceUsingRecursion(str1, str2, m - 1, n - 1);

        return 1 + Math.min(calculateEditDistanceUsingRecursion(str1, str2, m, n - 1),
                Math.min(calculateEditDistanceUsingRecursion(str1, str2, m - 1, n), calculateEditDistanceUsingRecursion(str1, str2, m - 1, n - 1)));
    }

    public int calculateEditDistanceUsingDp(String str1, String str2, int m, int n) {
        int[][] editDistance = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    editDistance[i][j] = j;

                else if (j == 0)
                    editDistance[i][j] = i;

                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    editDistance[i][j] = editDistance[i - 1][j - 1];

                else
                    editDistance[i][j] = 1 + Math.min(editDistance[i - 1][j],
                            Math.min(editDistance[i][j - 1], editDistance[i - 1][j - 1]));
            }
        }
        return editDistance[m][n];
    }
}
