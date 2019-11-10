package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

public class KnapsackTest {

    @Test
    public void findKnapsack() {
        int noOfItems = 4;
        int[] values = {0, 10, 40, 30, 50};
        int[] weights = {0, 5, 4, 6, 3};
        int knapsackCapacity = 10;
        new Knapsack(noOfItems, values, weights, knapsackCapacity).findKnapsack();
        //System.out.println(new Knapsack().findKnapsackRecursion(val, weight, W, val.length));
    }
}