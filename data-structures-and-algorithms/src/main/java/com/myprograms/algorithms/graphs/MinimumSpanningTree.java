package com.myprograms.algorithms.graphs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class MinimumSpanningTree {

    public void kruskalAlgorithm(Graph graph) {
        List<Edge> edges = graph.getEdges();
        Collections.sort(edges, Comparator.comparingInt(Edge::getWeight));

        GraphCycleChecker graphCycleChecker = new GraphCycleChecker();
        UndirectedGraph mst = new UndirectedGraph();

        Node start = edges.get(0).getSource();
        for(Edge edge: edges) {
            mst.addWeightedEdgeForUndirectedGraph(mst.getNode(edge.getSource().id), mst.getNode(edge.getDestination().id), edge.getWeight());
            if(graphCycleChecker.checkForCycleInUndirectedGraph(mst,start.id)) {
                mst.removeWeightedEdgeForUndirectedGraph(edge.getSource().id+"-"+edge.getDestination().id);
            }
        }

        for(Edge edge : mst.getEdges()) {
            System.out.println(edge);
        }
    }

    public void primsAlgorithm(Graph graph, int start) {
        Node source = graph.getNode(start);
        UndirectedGraph mst = new UndirectedGraph();
        HashSet<Integer> visited = new HashSet<>();
        Edge minEdge = null;
        Node parent = null;
        while (!source.adjacent.isEmpty()) {
            visited.add(source.id);
            for(Node node : source.adjacent) {
                if(parent != null && node.id == parent.id)
                    continue;

                if(visited.contains(node.id))
                    continue;

                Edge edge = findUndirectedEdge(source, node, graph);

                if(minEdge == null || edge.getWeight() < minEdge.getWeight())
                    minEdge = edge;
            }

            if(minEdge == null) {
                for(Node node : parent.adjacent) {
                    if(!visited.contains(node.id)) {
                        source = parent;
                        minEdge = findUndirectedEdge(parent, node, graph);
                        break;
                    }
                }
                if(source != parent)
                    break;
            }

            mst.addWeightedEdgeForUndirectedGraph(mst.getNode(minEdge.getSource().id), mst.getNode(minEdge.getDestination().id), minEdge.getWeight());
            parent = source;
            source = parent.id == minEdge.getDestination().id ? minEdge.getSource() : minEdge.getDestination();
            if(visited.contains(source.id))
                break;
            minEdge = null;
        }

        for(Edge edge : mst.getEdges()) {
            System.out.println(edge);
        }

    }

    private Edge findUndirectedEdge(Node parent, Node node, Graph graph) {
        Edge edge = graph.edges.get(parent.id+"-"+node.id);
        if(edge == null) {
            edge = graph.edges.get(node.id+"-"+parent.id);
        }
        return edge;
    }
}
