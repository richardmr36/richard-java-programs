package com.myprograms.miscellaneous.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyTest {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("I am "+ Thread.currentThread().getName());
        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i=0 ; i< 5; i++)
            service.execute(task);

        service.shutdown();

        /*Thread thread = new Thread(task);
        thread.start();*/

    }
}

