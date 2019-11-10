package com.myprograms.algorithms.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSpanningTreeTest {

    private Graph buildGraph() {
        UndirectedGraph graph = new UndirectedGraph();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        graph.addWeightedEdgeForUndirectedGraph(n0, n1, 4);
        graph.addWeightedEdgeForUndirectedGraph(n0, n7, 8);
        graph.addWeightedEdgeForUndirectedGraph(n1, n7, 11);
        graph.addWeightedEdgeForUndirectedGraph(n1, n2, 8);
        graph.addWeightedEdgeForUndirectedGraph(n2, n3, 7);
        graph.addWeightedEdgeForUndirectedGraph(n2, n8, 2);
        graph.addWeightedEdgeForUndirectedGraph(n7, n8, 7);
        graph.addWeightedEdgeForUndirectedGraph(n6, n7, 1);
        graph.addWeightedEdgeForUndirectedGraph(n5, n6, 2);
        graph.addWeightedEdgeForUndirectedGraph(n2, n5, 4);
        graph.addWeightedEdgeForUndirectedGraph(n3, n5, 14);
        graph.addWeightedEdgeForUndirectedGraph(n3, n4, 9);
        graph.addWeightedEdgeForUndirectedGraph(n4, n5, 10);
        graph.addWeightedEdgeForUndirectedGraph(n6, n8, 6);

        return graph;
    }

    @Test
    public void kruskalAlgorithm() {
        new MinimumSpanningTree().kruskalAlgorithm(buildGraph());
    }

    @Test
    public void primsAlgorithm() {
        new MinimumSpanningTree().primsAlgorithm(buildGraph(), 0);
    }
}