package com.myprograms.concurrency.problems.producerconsumer;

import com.myprograms.concurrency.blockingqueue.BlockingQueueImpl;
import com.myprograms.concurrency.blockingqueue.BlockingQueueImplWithLock;

public class ProducerConsumerApp {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueueImplWithLock buffer = new BlockingQueueImplWithLock(2);
        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    buffer.add(value);
                    System.out.println("Produced " + value);
                    value++;
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = buffer.poll();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}
