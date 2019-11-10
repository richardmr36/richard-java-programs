package com.myprograms.algorithms.dynamicprogramming;

public class EggDroppingPuzzle {

    /*https://www.geeksforgeeks.org/dynamic-programming-set-11-egg-dropping-puzzle/*/

    public int findNoOfTrailsNeededUsingRecursion(int noOfEggs, int noOfFloors) {
        if (noOfFloors == 0 || noOfFloors == 1)
            return noOfFloors;

        if (noOfEggs == 1)
            return noOfFloors;

        int min = Integer.MAX_VALUE;

        for (int x = 1; x <= noOfFloors; x++) {
            int result = Math.max(findNoOfTrailsNeededUsingRecursion(noOfEggs - 1, x - 1),
                    findNoOfTrailsNeededUsingRecursion(noOfEggs, noOfFloors - x));

            if (result < min)
                min = result;
        }

        return min + 1;
    }

    public int findNoOfTrailsNeededUsingDp(int noOfEggs, int noOfFloors) {
        int[][] eggTrails = new int[noOfEggs + 1][noOfFloors + 1];

        for (int i = 1; i <= noOfEggs; i++) {
            eggTrails[i][0] = 0;
            eggTrails[i][1] = 1;
        }

        for (int i = 1; i <= noOfFloors; i++) {
            eggTrails[1][i] = i;
            eggTrails[1][i] = i;
        }


        for (int i = 2; i <= noOfEggs; i++) {
            for (int j = 2; j <= noOfFloors; j++) {
                eggTrails[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int result = 1 + Math.max(eggTrails[i - 1][x - 1], eggTrails[i][j - x]);
                    if (result < eggTrails[i][j])
                        eggTrails[i][j] = result;
                }
            }
        }

        return eggTrails[noOfEggs][noOfFloors];
    }
}
