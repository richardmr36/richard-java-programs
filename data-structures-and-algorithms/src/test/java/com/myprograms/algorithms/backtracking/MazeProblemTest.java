package com.myprograms.algorithms.backtracking;

import org.junit.Test;

public class MazeProblemTest {

    private int[][] mazeTable = {
            {1, 1, 1, 1, 1},
            {0, 0, 0, 1, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 1, 1, 1}
    };

    @Test
    public void solve() {
        new MazeProblem().solve(mazeTable);
    }
}