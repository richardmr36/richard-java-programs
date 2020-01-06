package com.myprograms.algorithms.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListReverserTest {

    @Test
    public void reverseIteratively() {
        Node head = buildLinkedList();
        Node expectedHead = buildReversedLinkedList();

        Node headFromIterativeMethod = LinkedListReverser.reverseIteratively(head);
        Assert.assertTrue(isReversed(headFromIterativeMethod, expectedHead));
    }

    @Test
    public void reverseRecursively() {
        Node head = buildLinkedList();
        Node expectedHead = buildReversedLinkedList();

        Node headFromRecursiveMethod = LinkedListReverser.reverseRecursively(head, head, null);
        Assert.assertTrue(isReversed(headFromRecursiveMethod, expectedHead));
    }

    @Test
    public void reverseUsingStack() {
        Node head = buildLinkedList();
        Node expectedHead = buildReversedLinkedList();

        Node headFromStackMethod = LinkedListReverser.reverseUsingStack(head);
        Assert.assertTrue(isReversed(headFromStackMethod, expectedHead));
    }

    @Test
    public void reverseBetween() {
        Node head = buildLinkedList();
        int m = 2, n = 3;
        Node expectedHead = buildReversedLinkedListFromMToN();
        Node headFromStackMethod = LinkedListReverser.reverseBetween(head, m, n);
        Assert.assertTrue(isReversed(headFromStackMethod, expectedHead));
    }

    private Node buildReversedLinkedListFromMToN() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        linkedList.insertAtEnd(head, 3);
        linkedList.insertAtEnd(head, 2);
        linkedList.insertAtEnd(head, 4);
        return head;
    }

    private boolean isReversed(Node head, Node reversedHead) {
        while (head != null && reversedHead != null) {
            if (head.data == reversedHead.data) {
                head = head.next;
                reversedHead = reversedHead.next;
            }
            else {
                return false;
            }
        }

        return true;
    }

    private Node buildLinkedList() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        linkedList.insertAtEnd(head, 2);
        linkedList.insertAtEnd(head, 3);
        linkedList.insertAtEnd(head, 4);
        return head;
    }

    private Node buildReversedLinkedList() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(4);
        linkedList.insertAtEnd(head, 3);
        linkedList.insertAtEnd(head, 2);
        linkedList.insertAtEnd(head, 1);
        return head;
    }

}