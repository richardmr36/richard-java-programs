package com.myprograms.algorithms.graphs;

import java.util.Arrays;
import java.util.LinkedList;

public class FarthestNodeFinder {

    private static int EDGE_DISTANCE = 1;

    public static int findFarthestNodeUsingBFS(int startNode, Graph graph) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(graph.getNode(startNode));

        int[] distances = new int[graph.getSize() + 1];
        Arrays.fill(distances, -1);
        distances[startNode] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (Node neighbour : node.adjacent) {
                if (distances[neighbour.id] == -1) {
                    distances[neighbour.id] = distances[node.id] + EDGE_DISTANCE;
                    queue.add(neighbour);
                }
            }
        }

        int farthestNode = startNode;
        int max = 0;
        for (int i = 1; i < distances.length; i++) {
            if (distances[i] > max) {
                max = distances[i];
                farthestNode = i;
            }
        }

        return farthestNode;
    }
}
