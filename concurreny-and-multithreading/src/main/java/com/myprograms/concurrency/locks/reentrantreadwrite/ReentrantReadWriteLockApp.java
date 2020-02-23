package com.myprograms.concurrency.locks.reentrantreadwrite;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantReadWriteLockApp {
    public static void main(String[] args) {
        final ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedHashMapWithReadWriteLock object = new SynchronizedHashMapWithReadWriteLock();

        service.execute(new Thread(new Writer(object), "Writer"));
        service.execute(new Thread(new Reader(object), "Reader1"));
        service.execute(new Thread(new Reader(object), "Reader2"));

        service.shutdown();
    }

    private static class Reader implements Runnable {

        SynchronizedHashMapWithReadWriteLock object;

        Reader(SynchronizedHashMapWithReadWriteLock object) {
            this.object = object;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                object.get("key" + i);
            }
        }
    }

    private static class Writer implements Runnable {

        SynchronizedHashMapWithReadWriteLock object;

        public Writer(SynchronizedHashMapWithReadWriteLock object) {
            this.object = object;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    object.put("key" + i, "value" + i);
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
