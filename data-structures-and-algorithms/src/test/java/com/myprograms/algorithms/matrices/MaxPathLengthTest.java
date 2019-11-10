package com.myprograms.algorithms.matrices;

import static org.junit.Assert.assertEquals;

import com.myprograms.algorithms.utility.ArrayUtility;
import org.junit.Test;

public class MaxPathLengthTest {

    @Test
    public void find() {
        int[][] matrix = {
                {1, 2, 9},
                {5, 3, 8},
                {4, 6, 7}
        };

        assertEquals(4, MaxPathLength.find(matrix));
    }
}