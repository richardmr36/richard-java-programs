package com.myprograms.algorithms.matrices;

public class IslandFinder {

    private static final int TOTAL_POSSIBLE_MOVES = 8;
    private static final int[] ROW_MOVES = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] COL_MOVES = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static int findNoOfIslands(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        boolean[][] visited = new boolean[rowSize][colSize];
        int islandCount = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (matrix[row][col] == 1 && !visited[row][col]) {
                    checkForIslandUsingDFS(matrix, row, col, visited);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    private static void checkForIslandUsingDFS(int[][] matrix, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        for (int i = 0; i < TOTAL_POSSIBLE_MOVES; i++) {
            if (canFormIsland(matrix, row + ROW_MOVES[i], col + COL_MOVES[i], visited))
                checkForIslandUsingDFS(matrix, row + ROW_MOVES[i], col + COL_MOVES[i], visited);
        }
    }

    private static boolean canFormIsland(int[][] matrix, int row, int col, boolean[][] visited) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        return row >= 0 && row < rowSize && col >= 0 && col < colSize && matrix[row][col] == 1 && !visited[row][col];
    }
}
