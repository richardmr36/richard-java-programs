package com.myprograms.algorithms.recursion;

public class Staircase {
    public int noOfWaysOneCanClimbStaircaseIn123Steps(int stairCount) {

        if(stairCount < 0)
            return 0;

        if(stairCount == 0)
            return 1;

        return noOfWaysOneCanClimbStaircaseIn123Steps(stairCount-1) +
                noOfWaysOneCanClimbStaircaseIn123Steps(stairCount-2) +
                noOfWaysOneCanClimbStaircaseIn123Steps(stairCount-3);
    }
}
