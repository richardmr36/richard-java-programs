package com.myprograms.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTraversalsTest {

    private Node buildTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        return root;
    }

    @Test
    public void inOrder() {
        Node root = buildTree();
        new TreeTraversals().inOrder(root);
        System.out.println();
    }

    @Test
    public void preOrder() {
        Node root = buildTree();
        new TreeTraversals().preOrder(root);
        System.out.println();
    }

    @Test
    public void postOrder() {
        Node root = buildTree();
        new TreeTraversals().postOrder(root);
        System.out.println();
    }
}