package com.myprograms.algorithms.backtracking;


public class HamiltonianPath {
    private int[][] adjacencyMatrix;
    private int noOfVertices;
    private int[] hamiltonianPath;

    public int[] solve(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.noOfVertices = adjacencyMatrix.length;
        this.hamiltonianPath = new int[this.noOfVertices];
        this.hamiltonianPath[0] = 0;

        if (this.findFeasibleSolution(1))
            return hamiltonianPath;
        return new int[0];
    }

    private boolean findFeasibleSolution(int position) {
        if (position == noOfVertices) {
            if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1)
                return true;
            return false;
        }

        for (int vertex = 1; vertex < noOfVertices; vertex++) {
            if (isFeasible(position, vertex)) {
                hamiltonianPath[position] = vertex;

                if (findFeasibleSolution(position + 1))
                    return true;
            }
        }
        return false;

    }

    private boolean isFeasible(int position, int vertex) {

        if (!areVerticesConnected(position, vertex))
            return false;

        if (isVertexVisitedAlready(position, vertex))
            return false;

        return true;
    }

    private boolean isVertexVisitedAlready(int position, int vertex) {
        for (int i = 0; i < position; i++)
            if (hamiltonianPath[i] == vertex)
                return true;

        return false;
    }

    private boolean areVerticesConnected(int position, int vertex) {
        return adjacencyMatrix[hamiltonianPath[position - 1]][vertex] == 1;
    }
}
