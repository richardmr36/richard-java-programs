package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

public class DuplicateRemoverTest {

    private Node buildLinkedList() {
        Node head = null;
        LinkedList linkedList = new LinkedList();
        int T = -1;
        int[] arr = {1, 2, 3, 4, 3};
        while (T++ < 4) {
            int ele = arr[T];
            head = linkedList.insertAtEnd(head, ele);
        }

        return head;
    }

    @Test
    public void removeDuplicates() {
        Node head = DuplicateRemover.removeDuplicates(buildLinkedList());
        LinkedList.printList(head);
    }

    @Test
    public void removeDuplicatesWithoutBuffer() {
        Node head = DuplicateRemover.removeDuplicatesWithoutBuffer(buildLinkedList());
        LinkedList.printList(head);
    }
}