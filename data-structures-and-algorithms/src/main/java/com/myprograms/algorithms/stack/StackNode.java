package com.myprograms.algorithms.stack;

import java.util.Objects;

public class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StackNode stackNode = (StackNode) o;
        return data == stackNode.data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
