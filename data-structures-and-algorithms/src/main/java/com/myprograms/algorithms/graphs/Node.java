package com.myprograms.algorithms.graphs;

import java.util.LinkedList;

public class Node {
    int id;
    LinkedList<Node> adjacent;

    public Node(int id) {
        this.id = id;
        this.adjacent = new LinkedList<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
