package com.myprograms.algorithms.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TopologicalSortTest {

    @Test
    public void doTopologicalSort() {
        Graph g = new Graph();
        g.addEdge(g.getNode(6), g.getNode(3));
        g.addEdge(g.getNode(6), g.getNode(1));
        g.addEdge(g.getNode(5), g.getNode(1));
        g.addEdge(g.getNode(5), g.getNode(2));
        g.addEdge(g.getNode(3), g.getNode(4));
        g.addEdge(g.getNode(4), g.getNode(2));

        new TopologicalSort().doTopologicalSort(g);
    }
}