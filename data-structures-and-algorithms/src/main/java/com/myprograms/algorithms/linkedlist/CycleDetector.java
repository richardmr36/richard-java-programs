package com.myprograms.algorithms.linkedlist;

public class CycleDetector {
    public boolean isCycleDetected(Node head) {
        if(head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next!=null) {
            if(fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
