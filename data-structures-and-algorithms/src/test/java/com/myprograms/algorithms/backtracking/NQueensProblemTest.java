package com.myprograms.algorithms.backtracking;

import com.myprograms.algorithms.utility.Constants;
import org.junit.Assert;
import org.junit.Test;

public class NQueensProblemTest {

    private int BOARD_SIZE = Constants.CHESS_BOARD_SIZE;

    private int[][] expectedSolution = {
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
    };

    @Test
    public void solve() {
        int[][] solution = new NQueensProblem().solve(BOARD_SIZE);
        for (int i = 0; i < solution.length; i++)
            Assert.assertArrayEquals(expectedSolution[i], solution[i]);
    }
}