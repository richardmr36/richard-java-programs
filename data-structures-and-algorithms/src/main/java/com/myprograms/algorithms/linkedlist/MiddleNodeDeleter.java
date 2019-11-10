package com.myprograms.algorithms.linkedlist;

public class MiddleNodeDeleter {
    public static boolean deleteGivenNode(Node nodeToBeDeleted) {
        if(nodeToBeDeleted == null || nodeToBeDeleted.next == null)
            return false;

        Node next = nodeToBeDeleted.next;
        nodeToBeDeleted.data = next.data;
        nodeToBeDeleted.next = next.next;
        return true;
    }
}
