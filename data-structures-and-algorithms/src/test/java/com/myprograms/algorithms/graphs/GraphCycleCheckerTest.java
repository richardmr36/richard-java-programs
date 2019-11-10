package com.myprograms.algorithms.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphCycleCheckerTest {

    private Graph buildCyclicUndirectedGraph() {
        UndirectedGraph graph = new UndirectedGraph();
        Node n1 = graph.getNode(1);
        Node n2 = graph.getNode(2);
        Node n3 = graph.getNode(3);
        Node n4 = graph.getNode(4);
        Node n5 = graph.getNode(5);
        Node n6 = graph.getNode(6);

        graph.addEdgeForUndirectedGraph(n1,n2);
        graph.addEdgeForUndirectedGraph(n2,n3);
        graph.addEdgeForUndirectedGraph(n3,n4);
        graph.addEdgeForUndirectedGraph(n4,n1);
        graph.addEdgeForUndirectedGraph(n4,n6);

        return graph;
    }

    private Graph buildCyclicDirectedGraph() {
        UndirectedGraph graph = new UndirectedGraph();
        Node n1 = graph.getNode(1);
        Node n2 = graph.getNode(2);
        Node n3 = graph.getNode(3);
        Node n4 = graph.getNode(4);
        Node n5 = graph.getNode(5);
        Node n6 = graph.getNode(6);

        graph.addEdge(n1,n2);
        graph.addEdge(n1,n3);
        //graph.addEdge(n2,n3);
        graph.addEdge(n3,n1);
        graph.addEdge(n3,n4);

        return graph;
    }

    @Test
    public void checkForCycleForUndirectedGraph() {
        assertTrue("Cycle is not detected",new GraphCycleChecker().checkForCycleInUndirectedGraph(buildCyclicUndirectedGraph(), 1));
    }

    @Test
    public void checkForCycleForDirectedGraph() {
        assertFalse("Cycle is not detected",new GraphCycleChecker().checkForCycleInUndirectedGraph(buildCyclicDirectedGraph(), 1));
    }
}