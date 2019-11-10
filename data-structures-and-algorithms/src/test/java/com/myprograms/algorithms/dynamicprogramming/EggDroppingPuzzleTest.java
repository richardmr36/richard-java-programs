package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class EggDroppingPuzzleTest {

    @Test
    public void findNoOfTrailsNeededUsingRecursion() {
        System.out.println(new EggDroppingPuzzle().findNoOfTrailsNeededUsingRecursion(2,10));
    }

    @Test
    public void findNoOfTrailsNeededUsingDp() {
        System.out.println(new EggDroppingPuzzle().findNoOfTrailsNeededUsingDp(2,36));
    }

}