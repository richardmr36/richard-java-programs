package com.myprograms.algorithms.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleNodeDeleterTest {

    LinkedList linkedList = new LinkedList();

    @Test
    public void deleteGivenNode() {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++)
            head = linkedList.insertAtEnd(head, arr[i]);

        assertTrue(MiddleNodeDeleter.deleteGivenNode(head.next));
        LinkedList.printList(head);
    }
}