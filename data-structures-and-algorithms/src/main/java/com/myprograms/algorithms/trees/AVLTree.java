package com.myprograms.algorithms.trees;

public class AVLTree {
    public Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node;

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        int balance = getBalance(node);

        if (balance > 1 && data < node.left.data)
            return rightRotate(node);

        if (balance < -1 && data > node.right.data)
            return leftRotate(node);

        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node leftRotate(Node node) {
        Node nodeRight = node.right;
        Node nodeLeft = nodeRight.left;

        nodeRight.left = node;
        node.right = nodeLeft;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        nodeRight.height = Math.max(getHeight(nodeRight.left), getHeight(nodeRight.right)) + 1;

        return nodeRight;
    }

    private Node rightRotate(Node node) {
        Node nodeLeft = node.left;
        Node nodeRight = nodeLeft.right;

        nodeLeft.right = node;
        node.left = nodeRight;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        nodeLeft.height = Math.max(getHeight(nodeLeft.left), getHeight(nodeLeft.right)) + 1;

        return nodeLeft;
    }

    private int getBalance(Node node) {
        if (node == null)
            return 0;

        return getHeight(node.left) - getHeight(node.right);
    }

    private int getHeight(Node node) {
        if(node == null)
            return 0;

        return node.height;
    }
}
