package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

public class LinkedListSubsetTest {

    LinkedList linkedList = new LinkedList();

    @Test
    public void findNthToLastNodes() {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++)
            head = linkedList.insertAtEnd(head, arr[i]);

        head = LinkedListSubset.findNthToLastNodes(head, 2);
        LinkedList.printList(head);
    }
}