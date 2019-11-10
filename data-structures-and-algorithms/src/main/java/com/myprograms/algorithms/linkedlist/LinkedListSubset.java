package com.myprograms.algorithms.linkedlist;

public class LinkedListSubset {
    public static Node findNthToLastNodes(Node head, int n) {
        if (head == null || n < 1)
            return null;

        Node node = head;

        for (int i = 0; i < n; i++) {
            if(node == null)
                return null;

            node = node.next;
        }

        return node;
    }
}
