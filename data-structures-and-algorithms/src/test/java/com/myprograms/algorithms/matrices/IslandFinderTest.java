package com.myprograms.algorithms.matrices;

import org.junit.Assert;
import org.junit.Test;

public class IslandFinderTest {

    @Test
    public void findNoOfIslands() {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        int expectedNoOfIslands = 5;
        int noOfIslands = IslandFinder.findNoOfIslands(matrix);
        Assert.assertEquals(expectedNoOfIslands, noOfIslands);
    }
}