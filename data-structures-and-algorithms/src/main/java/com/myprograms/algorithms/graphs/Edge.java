package com.myprograms.algorithms.graphs;

public class Edge {
    private int weight;
    private Node source;
    private Node destination;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return this.getSource().id+"->"+this.getDestination().id;
    }
}
