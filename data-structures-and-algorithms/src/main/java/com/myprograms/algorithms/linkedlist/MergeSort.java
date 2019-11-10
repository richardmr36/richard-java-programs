package com.myprograms.algorithms.linkedlist;

public class MergeSort {
    public Node doMergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middle = this.getMiddleNode(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = doMergeSort(head);
        Node right = doMergeSort(nextOfMiddle);

        return merge(left, right);
    }

    public Node merge(Node left, Node right) {
        Node result = null;

        if(left == null)
            return right;

        if(right == null)
            return left;

        if(left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        }
        else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private Node getMiddleNode(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slowPointer = head;
        Node fastPointer = head.next;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}
