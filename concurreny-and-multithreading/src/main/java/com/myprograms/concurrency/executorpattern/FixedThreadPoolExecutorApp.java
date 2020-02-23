package com.myprograms.concurrency.executorpattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExecutorApp {
    public static void main(String[] args) {
        Runnable runnableTask = () -> System.out.println("Running by " + Thread.currentThread().getName() + "..");
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++)
            executorService.execute(runnableTask);

        Callable<String> callableTask = () -> sayHelloWorld();
        try {
            for (int i = 0; i < 10; i++) {
                Future<String> future = executorService.submit(callableTask);
                System.out.println(future.get());
            }
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdownNow();
        }
    }

    private static String sayHelloWorld() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello World from " + Thread.currentThread().getName() + "!";
    }
}
