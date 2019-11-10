package com.myprograms.algorithms.matrices;

import java.util.Arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class MaxPathLength {
    /*  Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell)
        such that all cells along the path are in increasing order with a difference of 1. We can move in
        4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1)
        with the condition that the adjacent cells have a difference of 1.
    */

    public static int find(int[][] matrix) {
        int size = matrix.length;
        int[][] lookup = new int[size][size];
        ArrayUtility.fill(lookup, -1);
        int result = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                findLongestFromCurrentPoint(i, j, matrix, lookup);
                result = Math.max(result, lookup[i][j]);
            }
        }

        return result;
    }

    private static int findLongestFromCurrentPoint(int i, int j, int[][] matrix, int[][] lookup) {
        int size = matrix.length;
        if (i < 0 || i >= size || j < 0 || j >= size)
            return 0;

        if (lookup[i][j] != -1)
            return lookup[i][j];

        if (j < size - 1 && ((matrix[i][j] + 1) == matrix[i][j + 1]))
            return lookup[i][j] = 1 + findLongestFromCurrentPoint(i, j + 1, matrix, lookup);

        if (j > 0 && (matrix[i][j] + 1 == matrix[i][j - 1]))
            return lookup[i][j] = 1 + findLongestFromCurrentPoint(i, j - 1, matrix, lookup);

        if (i > 0 && (matrix[i][j] + 1 == matrix[i - 1][j]))
            return lookup[i][j] = 1 + findLongestFromCurrentPoint(i - 1, j, matrix, lookup);

        if (i < size - 1 && (matrix[i][j] + 1 == matrix[i + 1][j]))
            return lookup[i][j] = 1 + findLongestFromCurrentPoint(i + 1, j, matrix, lookup);

        return lookup[i][j] = 1;
    }
}
