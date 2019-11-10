package com.myprograms.algorithms.backtracking;

import com.myprograms.algorithms.utility.Constants;

public class Sudoku {
    public static final int BOARD_SIZE = 9;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public static final int BOX_SIZE = 3;

    private int[][] sudokuTable;

    public void solve(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;

        if (solveSudoku(0, 0))
            printSolution();
        else
            System.out.println("There is no solution");
    }

    private boolean solveSudoku(int row, int column) {
        if (row == BOARD_SIZE && ++column == BOARD_SIZE)
            return true;

        if (row == BOARD_SIZE)
            row = 0;

        if (isValueInitialisedForGivenPosition(row, column))
            return solveSudoku(row + 1, column);

        for (int number = MIN_NUMBER; number <= MAX_NUMBER; number++) {
            if (isValid(row, column, number)) {
                sudokuTable[row][column] = number;

                if (solveSudoku(row + 1, column))
                    return true;

                sudokuTable[row][column] = 0;
            }
        }

        return false;
    }

    private boolean isValid(int row, int column, int number) {
        if (isNumberAlreadyPresentInRow(row, number))
            return false;

        if (isNumberAlreadyPresentInColumn(column, number))
            return false;

        if (isNumberAlreadyPresentInBox(row, column, number))
            return false;

        return true;
    }

    private boolean isNumberAlreadyPresentInBox(int row, int column, int number) {
        int boxRowOffset = (row / 3) * BOX_SIZE;
        int boxColumnOffset = (column / 3) * BOX_SIZE;

        for (int i = 0; i < BOX_SIZE; i++)
            for (int j = 0; j < BOX_SIZE; j++)
                if (sudokuTable[boxRowOffset + i][boxColumnOffset + j] == number)
                    return true;

        return false;
    }

    private boolean isNumberAlreadyPresentInColumn(int column, int number) {
        for (int i = 0; i < BOARD_SIZE; i++)
            if (sudokuTable[i][column] == number)
                return true;

        return false;
    }

    private boolean isNumberAlreadyPresentInRow(int row, int number) {
        for (int i = 0; i < BOARD_SIZE; i++)
            if (sudokuTable[row][i] == number)
                return true;

        return false;
    }

    private boolean isValueInitialisedForGivenPosition(int row, int column) {
        return sudokuTable[row][column] != 0;
    }

    private void printSolution() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (i % 3 == 0) System.out.println();

            for (int j = 0; j < BOARD_SIZE; j++) {
                if (j % 3 == 0) System.out.print(Constants.SINGLE_SPACE);
                System.out.print(sudokuTable[i][j] + Constants.SINGLE_SPACE);
            }
            System.out.println();
            ;
        }
    }
}
