package com.myprograms.algorithms.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void reverse() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        linkedList.insertAtEnd(head,2);
        linkedList.insertAtEnd(head,3);

        System.out.print("Original List: ");
        linkedList.printList(head);
        System.out.println();

        System.out.print("Reversed List: ");
        linkedList.printList(linkedList.reverse(head));
        System.out.println();
    }
}