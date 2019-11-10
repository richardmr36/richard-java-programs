package com.myprograms.algorithms.trees;

public class Node {
    int data;
    int height;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
        this.height = 1;
    }
}
