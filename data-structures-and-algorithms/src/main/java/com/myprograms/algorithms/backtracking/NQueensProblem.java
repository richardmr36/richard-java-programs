package com.myprograms.algorithms.backtracking;

import com.myprograms.algorithms.utility.Constants;
import com.myprograms.algorithms.utility.Printer;

public class NQueensProblem {
    private int[][] chessBoard;
    private int noOfQueens;

    public void solve(int noOfQueens) {
        this.chessBoard = new int[noOfQueens][noOfQueens];
        this.noOfQueens = noOfQueens;

        if (setQueens(0))
            printQueues();
        else
            System.out.println("There is no solution");
    }

    private void printQueues() {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if (chessBoard[i][j] == 1)
                    System.out.print(" Q ");
                else
                    System.out.print(" - ");
            }
            System.out.println();
        }
    }

    private boolean setQueens(int column) {
        if (column == noOfQueens)
            return true;

        for (int row = 0; row < noOfQueens; row++) {
            if (isPlaceValid(row, column)) {
                chessBoard[row][column] = 1;

                if (setQueens(column + 1))
                    return true;

                chessBoard[row][column] = 0; //Backtracked
            }
        }
        return false;
    }

    private boolean isPlaceValid(int row, int column) {

        if(isQueenAlreadyPlacedInSameRow(row, column))
            return false;

        if(isQueenAlreadyPlacedInLeftTopDiagonal(row, column))
            return false;

        if(isQueenAlreadyPlacedInLeftBottomDiagonal(row, column))
            return false;

        return true;
    }

    private boolean isQueenAlreadyPlacedInLeftBottomDiagonal(int row, int column) {
        for (int i = row, j = column; i < chessBoard.length && j >= 0; i++, j--)
            if (chessBoard[i][j] == 1)
                return true;

        return false;
    }

    private boolean isQueenAlreadyPlacedInLeftTopDiagonal(int row, int column) {
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (chessBoard[i][j] == 1)
                return true;

        return false;
    }

    private boolean isQueenAlreadyPlacedInSameRow(int row, int column) {
        for (int i = 0; i < column; i++)
            if (chessBoard[row][i] == 1)
                return true;

        return false;
    }
}
