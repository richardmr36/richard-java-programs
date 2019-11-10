package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListFlattenerTest {

    @Test
    public void flattenLinkedList() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        linkedList.insertAtEnd(head,2);
        linkedList.insertAtEnd(head,3);
        head.beside = new Node(4);
        head.beside.next = new Node(5);

        System.out.print("Original List: ");
        linkedList.printList(head);
        System.out.println();

        LinkedListFlattener flattener = new LinkedListFlattener();
        head = flattener.flattenLinkedList(head);

        System.out.print("Flattened List: ");
        linkedList.printList(head);
    }
}