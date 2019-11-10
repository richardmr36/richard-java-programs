package com.myprograms.algorithms.backtracking;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColoringProblemTest {

    @Test
    public void solve() {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0}
        };

        new ColoringProblem().solve(adjacencyMatrix, 3);
    }
}