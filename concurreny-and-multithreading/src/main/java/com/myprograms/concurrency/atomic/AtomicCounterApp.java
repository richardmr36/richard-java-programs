package com.myprograms.concurrency.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterApp {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<Future<?>> futureList = new ArrayList<>();
        try {
            for (int i = 0; i < 4; i++) {
                futureList.add(executorService.submit(new Incrementer()));
                futureList.add(executorService.submit(new Decrementer()));
            }

            futureList.forEach(
                    future -> {
                        try {
                            future.get();
                        }
                        catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
            );

            System.out.println("Final Counter value = " + counter);
        }
        finally {
            executorService.shutdownNow();
        }
    }

    private static class Incrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1_000; i++)
                counter.incrementAndGet();
        }
    }

    private static class Decrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1_000; i++)
                counter.decrementAndGet();
        }
    }
}
