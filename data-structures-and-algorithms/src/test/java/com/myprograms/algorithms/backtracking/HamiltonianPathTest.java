package com.myprograms.algorithms.backtracking;

import com.myprograms.algorithms.utility.Printer;
import org.junit.Test;

public class HamiltonianPathTest {

    @Test
    public void solve() {
        int[][] adjacencyMatrix = {
                {0, 1, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1}
        };

        Printer.printArray(new HamiltonianPath().solve(adjacencyMatrix));
    }
}