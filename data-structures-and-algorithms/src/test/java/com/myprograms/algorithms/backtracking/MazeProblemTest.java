package com.myprograms.algorithms.backtracking;

import org.junit.Assert;
import org.junit.Test;

public class MazeProblemTest {

    private int[][] mazeTable = {
            {1, 1, 1, 1, 1},
            {0, 0, 0, 1, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 1, 1, 1}
    };

    private int[][] expectedSolution = {
            {1, 1, 1, 1, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 1, 1}
    };

    @Test
    public void solve() {
        int[][] solution = new MazeProblem().solve(mazeTable);
        for (int i = 0; i < solution.length; i++)
            Assert.assertArrayEquals(expectedSolution[i], solution[i]);
    }
}