package com.myprograms.algorithms.graphs;

import org.junit.Assert;
import org.junit.Test;

public class FarthestNodeFinderTest {

    private Graph buildGraph() {
        Graph graph = new Graph();

        graph.addEdge(graph.getNode(7), graph.getNode(2));
        graph.addEdge(graph.getNode(7), graph.getNode(3));
        graph.addEdge(graph.getNode(7), graph.getNode(6));
        graph.addEdge(graph.getNode(7), graph.getNode(4));
        graph.addEdge(graph.getNode(7), graph.getNode(10));
        graph.addEdge(graph.getNode(3), graph.getNode(5));
        graph.addEdge(graph.getNode(6), graph.getNode(8));
        graph.addEdge(graph.getNode(6), graph.getNode(1));
        graph.addEdge(graph.getNode(8), graph.getNode(9));

        return graph;
    }

    @Test
    public void testFindFarthestNode() {
        Graph graph = buildGraph();
        int startNode = 7;
        Assert.assertEquals(9, FarthestNodeFinder.findFarthestNodeUsingBFS(startNode, graph));
    }
}