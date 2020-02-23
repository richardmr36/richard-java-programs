package com.myprograms.concurrency.barriers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CyclicBarrierApp {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future<List<Integer>>> futureList = new ArrayList<>();
        try {
            for (int i = 0; i < 100; i += (100 / 4))
                futureList.add(executorService.submit(new PrimeNoFinder(barrier, i, i + (100 / 4))));

            futureList.forEach(
                    future -> {
                        try {
                            List<Integer> integerList = future.get();
                            integerList.forEach(i -> System.out.print(i + ", "));
                            System.out.println();
                        }
                        catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                            future.cancel(true);
                        }
                    }
            );
        }
        finally {
            executorService.shutdownNow();
        }
    }
}
