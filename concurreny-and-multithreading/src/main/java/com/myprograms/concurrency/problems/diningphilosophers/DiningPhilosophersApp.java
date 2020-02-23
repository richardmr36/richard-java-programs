package com.myprograms.concurrency.problems.diningphilosophers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class DiningPhilosophersApp {
    public static void main(String[] args) {
        int n = 5;
        final Philosopher[] philosophers = new Philosopher[n];
        final Chopstick[] chopsticks = new Chopstick[n];
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("philosopher-%d").build();
        ExecutorService executorService = Executors.newFixedThreadPool(5, threadFactory);

        for (int i = 0; i < n; i++)
            chopsticks[i] = new Chopstick(i);

        for (int i = 0; i < n; i++) {
            philosophers[i] = new Philosopher(i, chopsticks, new SwapLastPhilosopherChopsticksOrdering(5));
            executorService.execute(philosophers[i]);
        }

        executorService.shutdownNow();
    }
}
