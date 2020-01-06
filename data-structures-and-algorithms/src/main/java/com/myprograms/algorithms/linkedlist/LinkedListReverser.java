package com.myprograms.algorithms.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class LinkedListReverser {
    public static Node reverseIteratively(Node head) {
        if (head == null)
            throw new IllegalArgumentException("Head is null");

        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static Node reverseRecursively(Node head, Node current, Node previous) {
        if (isLastNode(current)) {
            current.next = previous;
            return current;
        }

        Node next = current.next;
        current.next = previous;
        head = reverseRecursively(head, next, current);
        return head;
    }

    private static boolean isLastNode(Node current) {
        return current.next == null;
    }

    public static Node reverseUsingStack(Node head) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        Node node = stack.pop();
        head = node;

        while (!stack.isEmpty()) {
            Node next = stack.pop();
            node.next = next;
            node = next;
        }

        return head;
    }

    public static Node reverseBetween(Node head, int m, int n) {
        if (m == n)
            return head;

        Node previous = null;
        Node mNode = null;
        Node nPlusOneNode = null;

        int i = 0;
        Node node = head;
        while (node != null) {
            i++;
            if (i == m - 1)
                previous = node;

            if (i == m)
                mNode = node;

            if (i == n) {
                nPlusOneNode = node.next;
                node.next = null;
            }

            node = node.next;
        }
        if (mNode.next == null)
            return head;

        Node current = mNode;
        Node next = current.next;
        current.next = nPlusOneNode;

        while (current != null && next != null) {
            Node t = next.next;
            next.next = current;
            current = next;
            next = t;
        }

        if (previous != null)
            previous.next = current;
        else
            return current;

        return head;
    }
}
