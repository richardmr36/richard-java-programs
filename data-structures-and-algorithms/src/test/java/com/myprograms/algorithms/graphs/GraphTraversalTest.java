package com.myprograms.algorithms.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTraversalTest {

    @Test
    public void hasPathDFS() {
        Graph graph = buildGraph();
        assertTrue("There is no path from 1 to 4", new GraphTraversal().hasPathDFS(1,5,graph));
    }

    private Graph buildGraph() {
        Graph graph = new Graph();
        Node n1 = graph.getNode(1);
        Node n2 = graph.getNode(2);
        Node n3 = graph.getNode(3);
        Node n4 = graph.getNode(4);
        Node n5 = graph.getNode(5);
        Node n6 = graph.getNode(6);

        graph.addEdge(n1,n2);
        graph.addEdge(n2,n3);
        graph.addEdge(n3,n4);
        graph.addEdge(n1,n5);

        return graph;
    }

    @Test
    public void hasPathBFS() {
        Graph graph = buildGraph();
        assertTrue("There is no path from 1 to 4", new GraphTraversal().hasPathDFS(1,4,graph));
    }
}