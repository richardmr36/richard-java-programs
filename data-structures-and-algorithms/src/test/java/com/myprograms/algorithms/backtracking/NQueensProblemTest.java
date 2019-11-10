package com.myprograms.algorithms.backtracking;

import static org.junit.Assert.*;

import com.myprograms.algorithms.utility.Constants;
import org.junit.Test;

public class NQueensProblemTest {

    private int BOARD_SIZE = Constants.CHESS_BOARD_SIZE;

    @Test
    public void solve() {
        new NQueensProblem().solve(BOARD_SIZE);
    }
}