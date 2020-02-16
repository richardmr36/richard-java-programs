package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class KnapsackTest {

    @Test
    public void findKnapsack() {
        int noOfItems = 4;
        int[] values = {0, 10, 40, 30, 50};
        int[] weights = {0, 5, 4, 6, 3};
        int knapsackCapacity = 10;
        Assert.assertEquals(90, new Knapsack(noOfItems, values, weights, knapsackCapacity).findKnapsack());
    }

    @Test
    public void findKnapsackRecursion() {
        int noOfItems = 4;
        int[] values = {10, 40, 30, 50};
        int[] weights = {5, 4, 6, 3};
        int knapsackCapacity = 10;
        Assert.assertEquals(90, Knapsack.findKnapsackRecursion(values, weights, knapsackCapacity, noOfItems));
    }
}