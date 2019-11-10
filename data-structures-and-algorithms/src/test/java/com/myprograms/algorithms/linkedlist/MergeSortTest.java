package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void doMergeSort() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(15);
        linkedList.insertAtEnd(head, 10);
        linkedList.insertAtEnd(head, 5);
        linkedList.insertAtEnd(head, 20);
        linkedList.insertAtEnd(head, 3);
        linkedList.insertAtEnd(head, 2);

        System.out.print("Original List: ");
        linkedList.printList(head);
        System.out.println();

        MergeSort mergeSort = new MergeSort();
        head = mergeSort.doMergeSort(head);

        System.out.print("Sorted List: ");
        linkedList.printList(head);
    }
}