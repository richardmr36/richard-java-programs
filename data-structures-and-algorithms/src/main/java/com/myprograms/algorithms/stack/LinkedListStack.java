package com.myprograms.algorithms.stack;

public class LinkedListStack {
    private StackNode top;

    public void push(int data) {
        if (top == null) {
            top = new StackNode(data);
            return;
        }

        StackNode node = new StackNode(data);
        node.next = top;
        top = node;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public StackNode pop() {
        StackNode node = top;
        top = top.next;
        return node;
    }

    public void display() {
        StackNode node = top;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void reverse() {
        StackNode previous, current, successor;
        current = previous = top;
        current = current.next;
        previous.next = null;

        while (current != null) {
            successor = current.next;
            current.next = previous;
            previous = current;
            current = successor;
        }
        top = previous;
    }
}
