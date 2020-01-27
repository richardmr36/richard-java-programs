package com.myprograms.algorithms.backtracking;

public class MazeProblem {
    private int[][] mazeTable;
    private int[][] solutionTable;
    private int mazeSize;

    public int[][] solve(int[][] mazeTable) {
        this.mazeTable = mazeTable;
        this.mazeSize = mazeTable.length;
        this.solutionTable = new int[mazeSize][mazeSize];

        if (solveMaze(0, 0))
            return solutionTable;

        throw new IllegalStateException("There is no solution");
    }

    private boolean solveMaze(int x, int y) {
        if (isFinished(x, y))
            return true;

        if (isValid(x, y)) {
            solutionTable[x][y] = 1;

            if (solveMaze(x + 1, y)) //Down
                return true;

            if (solveMaze(x, y + 1)) //Right
                return true;

            if (solveMaze(x, y - 1)) //Left
                return true;

            if (solveMaze(x - 1, y)) //Up
                return true;

            solutionTable[x][y] = 0; //Backtracked
        }

        return false;
    }

    private boolean isValid(int x, int y) {
        if (x < 0 || x >= mazeSize) return false;
        if (y < 0 || y >= mazeSize) return false;
        return mazeTable[x][y] == 1;
    }

    private boolean isFinished(int x, int y) {
        if (x == mazeSize - 1 && y == mazeSize - 1) {
            solutionTable[x][y] = 1;
            return true;
        }
        return false;
    }

    public void printSolution() {
        for (int i = 0; i < mazeSize; i++) {
            for (int j = 0; j < mazeSize; j++) {
                if (solutionTable[i][j] == 1)
                    System.out.print(" S ");
                else
                    System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
