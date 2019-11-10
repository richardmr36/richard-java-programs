package com.myprograms.algorithms.backtracking;

public class ColoringProblem {
    private int noOfColors;
    private int[][] adjacencyMatrix;
    private int noOfVertices;
    private int[] colors;

    public void solve(int[][] adjacencyMatrix, int noOfColors) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.noOfColors = noOfColors;
        this.noOfVertices = adjacencyMatrix.length;
        this.colors = new int[noOfVertices];

        if (this.findFeasibleSolution(0))
            printResults();
        else
            System.out.println("There is no solution");
    }

    private void printResults() {
        for (int i = 0; i < noOfVertices; i++)
            System.out.println("Node " + (i + 1) + " has color index: " + colors[i]);
    }

    private boolean findFeasibleSolution(int vertex) {
        if (vertex == noOfVertices)
            return true;

        for (int colorIndex = 1; colorIndex <= noOfColors; colorIndex++) {
            if (isColorValid(vertex, colorIndex)) {
                colors[vertex] = colorIndex;

                if(findFeasibleSolution(vertex+1))
                    return true;
            }
        }

        return false;
    }

    private boolean isColorValid(int vertex, int colorIndex) {
        for(int i=0; i<noOfVertices;i++)
            if(isAdjacentVertexHavingSameColor(vertex, i, colorIndex))
                return false;

        return true;
    }

    private boolean isAdjacentVertexHavingSameColor(int vertex, int i, int colorIndex) {
        return adjacencyMatrix[vertex][i] == 1 && colorIndex == colors[i];
    }
}
