package com.myprograms.algorithms.memoization;

import org.junit.Test;

public class CoinChangeTest {

    @Test
    public void makeChange() {
        int[] coins = {1, 2, 3};
        int money = 5;
        System.out.println("Memoization result: " + new CoinChange().makeChange(coins, money));
        System.out.println("Naive Recursion result: " + new CoinChange().makeChangeRecursive(coins, money, 0));
        System.out.println("Dynamic Programming result: " + new CoinChange().makeChangeDp(coins, money));
    }
}