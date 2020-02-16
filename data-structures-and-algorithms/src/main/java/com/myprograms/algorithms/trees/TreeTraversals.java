package com.myprograms.algorithms.trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeTraversals {

    private StringBuilder traversedPath = new StringBuilder();

    public String getTraversedPath() {
        return traversedPath.toString();
    }

    public void inOrder(Node root) {
        if(root == null)
            return;

        inOrder(root.left);
        traversedPath.append(root.data).append(" ");
        inOrder(root.right);
    }

    public void inOrderIterative(Node root) {
        if(root == null)
            return;

        Deque<Node> stack = new ArrayDeque<>();
        traverseLeftAndAddToStack(root, stack);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            traversedPath.append(node.data).append(" ");
            if(node.right != null) {
                traverseLeftAndAddToStack(node.right, stack);
            }
        }
    }

    private void traverseLeftAndAddToStack(Node root, Deque<Node> stack) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public void preOrder(Node root) {
        if(root == null)
            return;

        traversedPath.append(root.data).append(" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        traversedPath.append(root.data).append(" ");
    }
}
