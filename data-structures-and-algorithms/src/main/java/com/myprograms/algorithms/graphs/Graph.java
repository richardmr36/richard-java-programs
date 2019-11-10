package com.myprograms.algorithms.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    protected Map<Integer,Node> nodes = new HashMap<>();

    public Map<Integer, Node> getNodes() {
        return nodes;
    }

    protected Map<String,Edge> edges = new HashMap<>();

    public Node getNode(int id) {
        if(nodes.containsKey(id))
            return nodes.get(id);

        Node node = new Node(id);
        nodes.put(id,node);
        return node;
    }

    public int getSize() {
        return nodes.size();
    }

    public void addEdge(Node source, Node destination) {
        source.adjacent.add(destination);
    }

    public void addWeightedEdge(Node source, Node destination, int weight) {
        final String key = source.id+"-"+destination.id;
        if(edges.containsKey(key)) {
            return;
        }

        Edge edge = new Edge();
        if(!nodes.containsKey(source.id))
            nodes.put(source.id, source);
        edge.setSource(source);

        if(!nodes.containsKey(destination.id))
            nodes.put(destination.id, destination);
        edge.setDestination(destination);

        edge.setWeight(weight);
        edges.put(key,edge);
    }

    public List<Edge> getEdges() {
        List<Edge> edgeList = new ArrayList<>(edges.size());
        for(String key : edges.keySet())
            edgeList.add(edges.get(key));

        return edgeList;
    }
}
