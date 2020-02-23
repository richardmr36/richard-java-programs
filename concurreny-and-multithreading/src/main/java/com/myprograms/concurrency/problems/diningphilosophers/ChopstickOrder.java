package com.myprograms.concurrency.problems.diningphilosophers;

public class ChopstickOrder {
    private Chopstick left;
    private Chopstick right;

    public Chopstick getLeft() {
        return left;
    }

    public Chopstick getRight() {
        return right;
    }

    public ChopstickOrder(Chopstick left, Chopstick right) {
        this.left = left;
        this.right = right;
    }
}
