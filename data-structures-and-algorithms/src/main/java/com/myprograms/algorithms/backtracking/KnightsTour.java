package com.myprograms.algorithms.backtracking;

import com.myprograms.algorithms.geometric.Point;
import com.myprograms.algorithms.utility.ArrayUtility;
import com.myprograms.algorithms.utility.Printer;

public class KnightsTour {
    private int[][] solutionMatrix;
    private int BOARD_SIZE;

    private Point[] possibleMoves = {
            new Point(2, 1),
            new Point(1, 2),
            new Point(-1, 2),
            new Point(-2, 1),
            new Point(-2, -1),
            new Point(-1, -2),
            new Point(1, -2),
            new Point(2, -1)
    };

    private int POSSIBLE_MOVES_COUNT = possibleMoves.length;

    public void solve(int boardSize) {
        this.BOARD_SIZE = boardSize;
        solutionMatrix = new int[boardSize][boardSize];
        this.initialiseBoard();

        solutionMatrix[0][0] = 1; //Starting point

        if (findFeasibleSolution(2, new Point(0, 0)))
            printSolution();
        else
            System.out.println("There is no solution");
    }

    private void printSolution() {
        Printer.print2DArrayWithSingleAndDoubleDigitsMixed(solutionMatrix);
    }

    private boolean findFeasibleSolution(int stepCount, Point point) {
        if (stepCount == BOARD_SIZE * BOARD_SIZE + 1)
            return true;

        for (int i = 0; i < POSSIBLE_MOVES_COUNT; i++) {
            Point possibleMove = possibleMoves[i];
            int x = point.getX() + possibleMove.getX();
            int y = point.getY() + possibleMove.getY();

            Point nextStep = new Point(x, y);
            if (isStepValid(nextStep)) {
                solutionMatrix[x][y] = stepCount;

                if (findFeasibleSolution(stepCount + 1, nextStep))
                    return true;

                solutionMatrix[x][y] = Integer.MIN_VALUE; //Backtracked
            }

        }

        return false;
    }

    private boolean isStepValid(Point point) {
        int x = point.getX();
        int y = point.getY();

        if (x < 0 || x >= BOARD_SIZE) return false;
        if (y < 0 || y >= BOARD_SIZE) return false;

        if (solutionMatrix[x][y] != Integer.MIN_VALUE) return false;

        return true;
    }

    private void initialiseBoard() {
        ArrayUtility.initialise2DArray(solutionMatrix, Integer.MIN_VALUE);
    }
}
