package com.myprograms.algorithms.linkedlist;

import java.util.Hashtable;


public class DuplicateRemover {
    public static Node removeDuplicates(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        Hashtable<Integer, Boolean> table = new Hashtable<>();
        table.put(temp.data, Boolean.TRUE);
        while (temp.next != null) {
            if (table.containsKey(temp.next.data)) {
                temp.next = temp.next.next;
            }
            else {
                table.put(temp.next.data, Boolean.TRUE);
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node removeDuplicatesWithoutBuffer(Node head) {
        if(head == null)
            return null;

        Node previous = head;
        Node current = previous.next;

        while (current != null) {
            Node runner = head;
            while (runner != current) {
                if(runner.data == current.data) {
                    Node temp = current.next;
                    previous.next = temp;
                    current = temp;
                    break;
                }

                runner = runner.next;
            }

            if(runner == current) {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }
}
