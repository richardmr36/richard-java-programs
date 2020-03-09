package com.myprograms.algorithms.linkedlist;

public class CycleDetector {
    public static boolean isCycleDetected(Node head) {
        if(head == null || head.next == null)
            return false;

        Node tortoise = head.next;
        Node hare = head.next.next;

        while (hare != null && hare.next != null) {
            if (hare == tortoise)
                return true;
            hare = hare.next.next;
            tortoise = tortoise.next;
        }

        return false;
    }

    public static Node findEntryPointOfCycle(Node head) {
        if(head == null || head.next == null)
            return null;

        Node tortoise = head.next;
        Node hare = head.next.next;

        while (hare != null && hare.next != null) {
            if(hare == tortoise) {
                tortoise = head;
                while (hare != tortoise) {
                    hare = hare.next;
                    tortoise = tortoise.next;
                }
                return hare;
            }

            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return null;
    }
}
