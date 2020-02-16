package com.myprograms.algorithms.trees;

public class BinaryTree {

    Node prev;

    public boolean checkForBstUsingMinMax(Node root) {
        return isBstUsingMinMax(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBstUsingMinMax(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data < min || root.data > max)
            return false;

        return isBstUsingMinMax(root.left, min, root.data - 1) &&
                isBstUsingMinMax(root.right, root.data + 1, max);

    }

    public boolean checkForBst(Node root) {
        return isBst(root, null, null);
    }

    private boolean isBst(Node root, Node left, Node right) {
        if (root == null)
            return true;

        if (left != null && root.data < left.data)
            return false;

        if (right != null && root.data > right.data)
            return false;

        return isBst(root.left, left, root) && isBst(root.right, root, right);
    }

    public boolean checkForBstUsingInOrderTraversalWithoutAuxiliaryArray(Node root) {
        return isBstUsingInOrderTraversalWithoutAuxiliaryArray(root);
    }

    private boolean isBstUsingInOrderTraversalWithoutAuxiliaryArray(Node root) {
        if (root == null)
            return true;

        if (!isBstUsingInOrderTraversalWithoutAuxiliaryArray(root.left))
            return false;

        if (prev != null && root.data <= prev.data)
            return false;
        prev = root;
        return isBstUsingInOrderTraversalWithoutAuxiliaryArray(root.right);
    }

    public boolean checkIfBinaryTreeIsMaxHeap(Node root) {
        if (root == null)
            return true;

        int noOfNodes = countNodes(root);

        if (isCompleteTree(root, 0, noOfNodes) && isMaxHeap(root))
            return true;

        return false;
    }

    private boolean isCompleteTree(Node root, int index, int noOfNodes) {
        if (root == null)
            return true;

        if (index >= noOfNodes)
            return false;

        return isCompleteTree(root.left, 2 * index + 1, noOfNodes) &&
                isCompleteTree(root.right, 2 * index + 1, noOfNodes);
    }

    private boolean isMaxHeap(Node root) {
        /*https://geeksforgeeks.org/check-if-a-given-binary-tree-is-heap/*/
        if(root.left == null && root.right == null)
            return true;

        if(root.right == null)
            return root.data >= root.left.data;

        else {
            if(root.data >= root.left.data && root.data >= root.right.data)
                return isMaxHeap(root.left) && isMaxHeap(root.right);
            return false;
        }
    }

    private int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public boolean isSymmetric(Node root) {
        if(root == null)
            throw new IllegalArgumentException("Root is null");

        return isMirrorOfEachOther(root.left, root.right);
    }

    public boolean isMirrorOfEachOther(Node left, Node right) {
        if(left == null && right == null)
            return true;

        if(left == null || right == null)
            return false;

        return left.data == right.data &&
                isMirrorOfEachOther(left.left, right.right) && isMirrorOfEachOther(left.right, right.left);
    }
}
