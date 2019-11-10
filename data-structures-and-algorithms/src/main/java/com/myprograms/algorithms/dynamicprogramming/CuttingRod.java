package com.myprograms.algorithms.dynamicprogramming;

public class CuttingRod {
    public int findMaxPriceWithOptimalRodCut(int[] price, int n) {
        if (n <= 0)
            return 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            max = Math.max(max, price[i] + findMaxPriceWithOptimalRodCut(price, n - i - 1));

        return max;
    }

    public int findMaxPriceWithOptimalRodCutUsingDp(int[] price) {
        int n = price.length;
        int[] max = new int[n + 1];
        max[0] = 0;

        for (int i = 1; i <= n; i++) {
            int currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                currentMax = Math.max(currentMax, price[j] + max[i - j - 1]);
                max[i] = currentMax;
            }
        }

        return max[n];
    }

    public void findOptimalRodCuttingPriceForGivenLength(int[] price, int rodLength) {
        int[][] rodCutLengthTable = new int[price.length][rodLength + 1];

        for (int i = 1; i < price.length; i++) {
            for (int j = 1; j <= rodLength; j++) {
                if (i <= j)
                    rodCutLengthTable[i][j] = Math.max(rodCutLengthTable[i - 1][j], price[i] + rodCutLengthTable[i][j - i]);
                else
                    rodCutLengthTable[i][j] = rodCutLengthTable[i - 1][j];
            }
        }

        showResult(rodCutLengthTable, price, rodLength);
    }

    public void showResult(int[][] rodCutLengthTable, int[] price, int rodLength) {
        System.out.println("Optimal Profit: " + rodCutLengthTable[price.length - 1][rodLength]);

        for (int i = price.length - 1, j = rodLength; i > 0; ) {
            if (rodCutLengthTable[i][j] != 0 && rodCutLengthTable[i][j] != rodCutLengthTable[i - 1][j]) {
                System.out.println("We make cut " + i + " meter(s)");
                j = j - i;
            } else
                i--;
        }
    }

}
