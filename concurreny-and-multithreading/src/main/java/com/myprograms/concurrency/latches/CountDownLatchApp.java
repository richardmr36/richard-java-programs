package com.myprograms.concurrency.latches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CountDownLatchApp {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            Future<Void> dataServiceFuture = executorService.submit(new MyServiceWorker(latch, new MyDataService()));
            Future<Void> authServiceFuture = executorService.submit(new MyServiceWorker(latch, new MyAuthenticationService()));

            try {
                latch.await(3, TimeUnit.SECONDS);
                if (dataServiceFuture.isDone() && authServiceFuture.isDone())
                    System.out.println("Server started successfully!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finally {
            executorService.shutdownNow();
        }
    }
}
