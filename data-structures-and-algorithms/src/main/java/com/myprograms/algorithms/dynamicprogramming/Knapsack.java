package com.myprograms.algorithms.dynamicprogramming;

public class Knapsack {
    private int noOfItems;
    private int[][] knapsackTable;
    private int[] values;
    private int[] weights;
    private int knapsackCapacity;

    public Knapsack(int noOfItems, int[] values, int[] weights, int knapsackCapacity) {
        this.noOfItems = noOfItems;
        this.values = values;
        this.weights = weights;
        this.knapsackCapacity = knapsackCapacity;
        this.knapsackTable = new int[noOfItems + 1][knapsackCapacity + 1];
    }

    public int findKnapsack() {

        for (int i = 1; i <= noOfItems; i++) {
            for (int w = 1; w <= knapsackCapacity; w++) {
                int valueWithoutCurrentItem = knapsackTable[i - 1][w];
                int valueWithCurrentItem = 0;

                if (weights[i] <= w)
                    valueWithCurrentItem = values[i] + knapsackTable[i - 1][w - weights[i]];

                knapsackTable[i][w] = Math.max(valueWithoutCurrentItem, valueWithCurrentItem);
            }
        }

        //showItemsIncludedInResult();
        return knapsackTable[noOfItems][knapsackCapacity];
    }

    public void showItemsIncludedInResult() {
        System.out.println("Total Benefit = " + knapsackTable[noOfItems][knapsackCapacity]);

        for (int n = noOfItems, w = knapsackCapacity; n > 0; n--) {
            if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n - 1][w]) {
                System.out.println("We take item: #" + n);
                w = w - weights[n];
            }
        }
    }

    public static int findKnapsackRecursion(int[] val, int[] weight, int W, int n) {
        if (n == 0 || W == 0)
            return 0;

        if (weight[n - 1] > W)
            return findKnapsackRecursion(val, weight, W, n - 1);

        return Math.max(val[n - 1] + findKnapsackRecursion(val, weight, W - weight[n - 1], n - 1),
                findKnapsackRecursion(val, weight, W, n - 1));
    }
}
