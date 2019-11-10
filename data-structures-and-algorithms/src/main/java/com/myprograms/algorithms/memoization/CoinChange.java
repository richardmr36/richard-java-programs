package com.myprograms.algorithms.memoization;

import java.util.HashMap;

public class CoinChange {
    public long makeChange(int[] coins, int money) {
        return makeChange(coins, money, 0, new HashMap<String, Long>());
    }

    private long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo) {
        if (money == 0) {
            return 1;
        }

        if (index >= coins.length) {
            return 0;
        }

        String key = money + "-" + index;
        if (memo.containsKey(key))
            return memo.get(key);

        int amountWithCoin = 0;
        long ways = 0;
        while (amountWithCoin <= money) {
            int remaining = money - amountWithCoin;
            ways += makeChange(coins, remaining, index + 1, memo);
            amountWithCoin += coins[index];
        }

        memo.put(key, ways);
        return ways;
    }

    public long makeChangeRecursive(int[] coins, int money, int index) {
        if (money < 0) return 0;
        if (money == 0) return 1;

        if (coins.length == index) return 0;

        return makeChangeRecursive(coins, money - coins[index], index) + makeChangeRecursive(coins, money, index + 1);
    }

    public long makeChangeDp(int[] coins, int money) {
        int noOfCoins = coins.length;
        long[][] coinsChangeTable = new long[noOfCoins + 1][money + 1];

        initialiseZeroMoneyColumn(coinsChangeTable, noOfCoins);
        initialiseZeroCoinsRow(coinsChangeTable, money);

        for (int c = 1; c <= noOfCoins; c++) {
            for (int m = 1; m <= money; m++) {
                if (coins[c - 1] <= m)
                    coinsChangeTable[c][m] = coinsChangeTable[c-1][m] + coinsChangeTable[c][m-coins[c-1]];
                else
                    coinsChangeTable[c][m] = coinsChangeTable[c-1][m];
            }
        }

        return coinsChangeTable[noOfCoins][money];
    }

    private void initialiseZeroCoinsRow(long[][] coinsChangeTable, int money) {
        for (int i = 1; i <= money; i++)
            coinsChangeTable[0][i] = 0;
    }

    private void initialiseZeroMoneyColumn(long[][] coinsChangeTable, int noOfCoins) {
        for (int i = 0; i <= noOfCoins; i++)
            coinsChangeTable[i][0] = 1;
    }
}
