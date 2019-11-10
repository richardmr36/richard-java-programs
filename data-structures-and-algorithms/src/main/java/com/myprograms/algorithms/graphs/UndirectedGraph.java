package com.myprograms.algorithms.graphs;

public class UndirectedGraph extends Graph {
    public void addEdgeForUndirectedGraph(Node source, Node destination) {
        source.adjacent.add(destination);
        destination.adjacent.add(source);
    }

    public void addWeightedEdgeForUndirectedGraph(Node source, Node destination, int weight) {
        addWeightedEdge(source,destination,weight);
        source.adjacent.add(destination);
        destination.adjacent.add(source);
    }

    public void removeWeightedEdgeForUndirectedGraph(String key) {
        Edge edge = edges.remove(key);
        edge.getSource().adjacent.remove(edge.getDestination());
        edge.getDestination().adjacent.remove(edge.getSource());
    }
}
