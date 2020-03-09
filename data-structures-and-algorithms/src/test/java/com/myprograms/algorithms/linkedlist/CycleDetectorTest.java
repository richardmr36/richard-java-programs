package com.myprograms.algorithms.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleDetectorTest {

    LinkedList linkedList = new LinkedList();

    @Test
    public void isCycleDetected() {
        Node head = buildCycle();
        assertTrue("Cycle is not detected", CycleDetector.isCycleDetected(head));
    }

    private Node buildCycle() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        return n1;
    }

    @Test
    public void findEntryPointOfCycle() {
        Node head = buildCycle();
        assertEquals("Cycle is not detected", 3, CycleDetector.findEntryPointOfCycle(head).data);
    }
}