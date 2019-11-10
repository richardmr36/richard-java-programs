package com.myprograms.algorithms.geometric;

public class Polygon {

    int noOfVertices;
    Point[] vertex;

    public Polygon(Point[] vertex) {
        this.vertex = vertex;
        this.noOfVertices = vertex.length;
    }
}
