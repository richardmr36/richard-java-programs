package com.myprograms.concurrency.problems.diningphilosophers;

public abstract class ChopsticksOrdering {
    protected int noOfChopsticks;

    public ChopsticksOrdering() {
    }

    public ChopsticksOrdering(int noOfChopsticks) {
        this.noOfChopsticks = noOfChopsticks;
    }

    public abstract ChopstickOrder getOrdering(Chopstick left, Chopstick right);
}
