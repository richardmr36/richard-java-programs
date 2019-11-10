package com.myprograms.miscellaneous.concurrency;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionStageExample {
    public static long getTime1() {
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Tet");
        //return Long.valueOf("4");
    }

    public static long getTime2() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Long.valueOf("2");
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        CompletableFuture<Long> completableFuture1 = CompletableFuture.supplyAsync(CompletionStageExample::getTime1 ,exec);
        CompletableFuture<Long> completableFuture2 = CompletableFuture.supplyAsync(CompletionStageExample::getTime2 ,exec);
        completableFuture1.acceptEitherAsync(completableFuture2, (val) -> {
            System.out.println("Time: "+val);
        }, exec);
    }
}
