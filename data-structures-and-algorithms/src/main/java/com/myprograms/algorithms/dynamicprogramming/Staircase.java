package com.myprograms.algorithms.dynamicprogramming;

public class Staircase {
    public int noOfWaysOneCanClimbStaircaseIn123Steps(int stairCount) {
        if(stairCount<0)
            return 0;

        if(stairCount<=1)
            return 1;

        int[] paths = new int[stairCount+1];
        paths[0] = 1;
        paths[1] = 1;
        paths[2] = 2;

        for(int i=3;i<=stairCount;i++) {
            paths[i] = paths[i-1] + paths[i-2] + paths[i-3];
        }
        return paths[stairCount];
    }

    public int countWaysWithoutDP(int stairCount) {
        if(stairCount<0)
            return 0;

        if(stairCount<=1)
            return 1;

        int[] paths = new int[stairCount+1];
        paths[0] = 1;
        paths[1] = 1;
        paths[2] = 2;

        for(int i=3;i<=stairCount;i++) {
            int count = paths[2] + paths[1] + paths[0];
            paths[0] = paths[1];
            paths[1] = paths[2];
            paths[2] = count;
        }

        return paths[2];
    }
}
