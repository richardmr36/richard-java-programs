package com.myprograms.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class AVLTreeTest {

    TreeTraversals traversal = new TreeTraversals();

    @Test
    public void insert() {
        AVLTree tree = new AVLTree();
        Node root = new Node(10);
        root = tree.insert(root, 20);
        root = tree.insert(root, 30);
        root = tree.insert(root, 40);
        root = tree.insert(root, 50);
        root = tree.insert(root, 25);

        traversal.preOrder(root);

    }

}