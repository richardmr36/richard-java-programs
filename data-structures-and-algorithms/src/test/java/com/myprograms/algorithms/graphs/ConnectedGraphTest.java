package com.myprograms.algorithms.graphs;

import org.junit.Test;

public class ConnectedGraphTest {

    @Test
    public void getBiggestMatrix() {
        int[][] matrix1 = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 0}
        };

        int[][] matrix2 = {
                {0, 0, 1, 1},
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(new ConnectedGraph().getBiggestMatrix(matrix2));
    }
}