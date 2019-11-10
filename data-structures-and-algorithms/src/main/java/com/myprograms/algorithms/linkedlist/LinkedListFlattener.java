package com.myprograms.algorithms.linkedlist;

public class LinkedListFlattener {

    public Node flattenLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        head.beside = flattenLinkedList(head.beside);
        return this.merge(head, head.beside);
    }

    private Node merge(Node head, Node next) {
        if (head == null)
            return next;

        if (next == null)
            return head;

        Node result = null;

        if (head.data < next.data) {
            result = head;
            result.next = merge(head.next, next);
        }
        else {
            result = next;
            result.next = merge(head, next.next);
        }

        return result;
    }
}
