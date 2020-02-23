package com.myprograms.concurrency.problems.diningphilosophers;

public class SwapLastPhilosopherChopsticksOrdering extends ChopsticksOrdering {

    public SwapLastPhilosopherChopsticksOrdering(int noOfChopsticks) {
        super(noOfChopsticks);
    }

    @Override
    public ChopstickOrder getOrdering(Chopstick left, Chopstick right) {
        if(left.getId() == noOfChopsticks - 1)
            return new ChopstickOrder(right, left);

        return new ChopstickOrder(left, right);
    }
}
