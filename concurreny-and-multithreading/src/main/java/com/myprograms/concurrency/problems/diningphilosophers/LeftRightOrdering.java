package com.myprograms.concurrency.problems.diningphilosophers;

public class LeftRightOrdering extends ChopsticksOrdering {
    @Override
    public ChopstickOrder getOrdering(Chopstick left, Chopstick right) {
        return new ChopstickOrder(left, right);
    }
}
