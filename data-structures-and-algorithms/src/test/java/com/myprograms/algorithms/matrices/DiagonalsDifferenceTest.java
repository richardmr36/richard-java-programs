package com.myprograms.algorithms.matrices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiagonalsDifferenceTest {

    @Test
    public void findDifferenceBetweenDiagonalsSum() {
        int[][] matrix = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        assertEquals("Difference is wrong", 15, DiagonalsDifference.findDifferenceBetweenDiagonalsSum(matrix));
    }
}