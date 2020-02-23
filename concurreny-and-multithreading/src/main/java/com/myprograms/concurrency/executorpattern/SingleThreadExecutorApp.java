package com.myprograms.concurrency.executorpattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SingleThreadExecutorApp {
    public static void main(String[] args) {
        Runnable runnableTask = () -> System.out.println("Running by " + Thread.currentThread().getName() + "..");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++)
            executorService.execute(runnableTask);


        Callable<String> callableTask = () -> sayHelloWorld();
        Future<String> future = executorService.submit(callableTask);
        try {
            System.out.println(future.get());
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


        future = executorService.submit(callableTask);
        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        }
        catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace(); //TimeoutException expected
        }
        finally {
            executorService.shutdown(); //soft shutdown
        }


        executorService = Executors.newSingleThreadExecutor();
        Callable<String> voidCallable = () -> {
            throw new IllegalStateException("Invalid state from " + Thread.currentThread().getName() + "!");
        };

        future = executorService.submit(voidCallable);
        try {
            future.get();
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace(); //ExecutionException expected
        }
        finally {
            executorService.shutdownNow(); //hard shutdown
        }
    }

    private static String sayHelloWorld() throws InterruptedException {
        Thread.sleep(1000);
        return "Hello World from " + Thread.currentThread().getName() + "!";
    }
}
