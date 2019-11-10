package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleDetectorTest {

    LinkedList linkedList = new LinkedList();

    @Test
    public void isCycleDetected() {
        Node head = buildCycle();
        assertTrue("Cycle is not detected", new CycleDetector().isCycleDetected(head));
    }

    private Node buildCycle() {
        Node n1 = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(1);
        Node n4 = new Node(1);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        return n1;
    }
}