package com.myprograms.algorithms.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GraphTraversalTest {

    private Graph graph;

    @Before
    public void setUp() throws Exception {
        graph = buildGraph();
    }

    private Graph buildGraph() {
        Graph graph = new Graph();
        Node n1 = graph.getNode(1);
        Node n2 = graph.getNode(2);
        Node n3 = graph.getNode(3);
        Node n4 = graph.getNode(4);
        Node n5 = graph.getNode(5);
        //Node n6 = graph.getNode(6);

        graph.addEdge(n1, n2);
        graph.addEdge(n2, n3);
        graph.addEdge(n3, n4);
        graph.addEdge(n1, n5);

        return graph;
    }

    private Graph buildGraphForTopSort() {
        Graph graph = new Graph();
        Node n0 = graph.getNode(0);
        Node n1 = graph.getNode(1);
        Node n2 = graph.getNode(2);
        Node n3 = graph.getNode(3);
        Node n4 = graph.getNode(4);
        Node n5 = graph.getNode(5);

        graph.addEdge(n5, n2);
        graph.addEdge(n5, n0);
        graph.addEdge(n4, n0);
        graph.addEdge(n4, n1);
        graph.addEdge(n2, n3);
        graph.addEdge(n3, n1);

        return graph;
    }

    @Test
    public void hasPathDFS() {
        assertTrue("There is no path from 1 to 4", GraphTraversal.hasPathDFS(1, 5, graph));
    }

    @Test
    public void hasPathBFS() {
        assertTrue("There is no path from 1 to 4", GraphTraversal.hasPathBFS(1, 4, graph));
    }

    @Test
    public void doTopSort() {
        Graph graph = buildGraphForTopSort();
        assertEquals("5->4->2->3->1->0", GraphTraversal.doTopologicalSort(graph));
    }

    @Test
    public void doTopSortUsingKahn() {
        Graph graph = buildGraphForTopSort();
        assertEquals("4->5->2->0->3->1", GraphTraversal.doTopologicalSortUsingKahnAlgorithm(graph));
    }
}