package com.myprograms.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    private Node buildCorrectTree() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        return root;
    }

    private Node buildWrongTree() {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        return root;
    }

    @Test
    public void checkForBstUsingMinMax() {
        BinaryTree tree = new BinaryTree();
        Node root = buildCorrectTree();
        assertTrue("This is not a BST", tree.checkForBstUsingMinMax(root));
    }

    @Test
    public void checkForBst() {
        BinaryTree tree = new BinaryTree();
        Node root = buildWrongTree();
        assertFalse("This is not a BST", tree.checkForBst(root));
    }

    @Test
    public void checkForBstUsingInOrderTraversalWithoutAuxiliaryArray() {
        BinaryTree tree = new BinaryTree();
        Node root = buildWrongTree();
        assertFalse("This is not a BST", tree.checkForBstUsingInOrderTraversalWithoutAuxiliaryArray(root));
    }

    @Test
    public void checkIfBstIsMaxHeap() {
        BinaryTree tree = new BinaryTree();
        Node root = buildMaxHeap();
        assertTrue("This is not a Max Heap", tree.checkIfBinaryTreeIsMaxHeap(root));
    }

    private Node buildMaxHeap() {
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(2);
        root.left.right.left = new Node(1);
        return root;
    }


    @Test
    public void testIsMirrorOfEachOther() {
        BinaryTree tree = new BinaryTree();
        Node a = new Node(1);
        Node b = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(4);
        Assert.assertTrue(tree.isMirrorOfEachOther(a, b));
    }

    @Test
    public void testIsBalancedTree() {
        BinaryTree tree = new BinaryTree();
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        Assert.assertTrue(tree.isBalancedTree(a));

        Node b = new Node(1);
        b.left = new Node(2);
        b.right = new Node(3);
        b.left.left = new Node(4);
        b.left.left.right = new Node(5);

        Assert.assertFalse(tree.isBalancedTree(b));
    }
}