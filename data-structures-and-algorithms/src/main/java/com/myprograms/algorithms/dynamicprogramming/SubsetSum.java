package com.myprograms.algorithms.dynamicprogramming;

public class SubsetSum {
    public void findFeasibleSubset(int[] arr, int sum) {
        boolean[][] subsetSumTable = new boolean[arr.length + 1][sum + 1];

        initialiseForZeroSumColumn(subsetSumTable, arr.length);

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1])
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j];
                else if (subsetSumTable[i - 1][j])
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j];
                else
                    subsetSumTable[i][j] = subsetSumTable[i - 1][j - arr[i - 1]];
            }
        }

        if (subsetSumTable[arr.length][sum])
            printSolution(subsetSumTable, arr, sum);
        else
            System.out.println("There is no solution");
    }

    private void printSolution(boolean[][] subsetSumTable, int[] arr, int sum) {
        for (int i = arr.length, j = sum; i > 0 || j > 0; ) {
            if (subsetSumTable[i][j] && subsetSumTable[i - 1][j])
                i--;
            else {
                System.out.println("We take " + arr[i - 1]);
                j = j - arr[i - 1];
                i--;
            }
        }
    }

    private void initialiseForZeroSumColumn(boolean[][] subsetSumTable, int length) {
        for (int i = 0; i < length; i++)
            subsetSumTable[i][0] = true;
    }
}
