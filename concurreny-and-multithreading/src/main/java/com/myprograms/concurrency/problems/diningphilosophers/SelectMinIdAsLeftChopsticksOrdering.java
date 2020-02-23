package com.myprograms.concurrency.problems.diningphilosophers;

public class SelectMinIdAsLeftChopsticksOrdering extends ChopsticksOrdering {
    @Override
    public ChopstickOrder getOrdering(Chopstick left, Chopstick right) {
        if(left.getId() < right.getId())
            return new ChopstickOrder(left, right);

        return new ChopstickOrder(right, left);
    }
}
