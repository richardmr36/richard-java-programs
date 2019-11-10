package com.myprograms.algorithms.matrices;

public class DiagonalsDifference {
    public static int findDifferenceBetweenDiagonalsSum(int[][] matrix) {
        int n = matrix.length;
        int firstDiagonal = 0, secondDiagonal = 0;
        for(int i=0,j=n-1;i<n&&j>=0;i++,j--) {
            firstDiagonal += matrix[i][i];
            secondDiagonal += matrix[i][j];
        }
        return Math.abs(firstDiagonal-secondDiagonal);
    }
}
