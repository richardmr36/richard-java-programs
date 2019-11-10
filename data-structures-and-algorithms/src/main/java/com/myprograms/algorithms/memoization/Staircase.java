package com.myprograms.algorithms.memoization;

public class Staircase {
    public int noOfWaysOneCanClimbStaircaseIn123Steps(int stairCount) {
        return countWays(stairCount, new int[stairCount+1]);
    }

    private int countWays(int stairCount, int[] memo) {
        if(stairCount < 0)
            return 0;

        if(stairCount == 0)
            return 1;

        if(memo[stairCount] == 0) {
            memo[stairCount] = countWays(stairCount-1 , memo) +
                    countWays(stairCount-2, memo) +
                    countWays(stairCount-3, memo);
        }

        return memo[stairCount];
    }

}
