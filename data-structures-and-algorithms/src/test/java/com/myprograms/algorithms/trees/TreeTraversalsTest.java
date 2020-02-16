package com.myprograms.algorithms.trees;

import org.junit.Assert;
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
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.inOrder(root);
        Assert.assertEquals("4 2 5 1 3 ", treeTraversals.getTraversedPath());

        treeTraversals = new TreeTraversals();
        treeTraversals.inOrderIterative(root);
        Assert.assertEquals("4 2 5 1 3 ", treeTraversals.getTraversedPath());
    }

    @Test
    public void preOrder() {
        Node root = buildTree();
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.preOrder(root);
        Assert.assertEquals("1 2 4 5 3 ", treeTraversals.getTraversedPath());
    }

    @Test
    public void postOrder() {
        Node root = buildTree();
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.postOrder(root);
        Assert.assertEquals("4 5 2 3 1 ", treeTraversals.getTraversedPath());
    }
}