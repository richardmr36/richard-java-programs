package com.myprograms.algorithms.linkedlist;

public class LinkedList {
    public Node insertAtEnd(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public Node insertAtBeginning(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;

        p.next = head;
        head = p;
        return head;
    }

    public void deleteWithValue(Node head, int data) {
        if(head == null)
            return;

        if(head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void printList(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public Node reverse(Node head) {
        Node previous = null;
        Node next = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
