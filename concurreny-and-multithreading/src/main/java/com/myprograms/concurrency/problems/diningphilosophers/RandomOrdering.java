package com.myprograms.concurrency.problems.diningphilosophers;

import java.util.Random;

public class RandomOrdering extends ChopsticksOrdering {

    private final Random random = new Random();

    @Override
    public ChopstickOrder getOrdering(Chopstick left, Chopstick right) {
        boolean selection = random.nextBoolean();
        if(selection)
            return new ChopstickOrder(left, right);

        return new ChopstickOrder(right, left);
    }
}
