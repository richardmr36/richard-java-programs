package com.myprograms.concurrency.latches;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class MyServiceWorker implements Callable<Void> {

    private CountDownLatch latch;
    private MyService service;

    public MyServiceWorker(CountDownLatch latch, MyService service) {
        this.latch = latch;
        this.service = service;
    }

    @Override
    public Void call() throws Exception {
        service.init();
        Thread.sleep(1000);
        latch.countDown();
        return null;
    }
}
