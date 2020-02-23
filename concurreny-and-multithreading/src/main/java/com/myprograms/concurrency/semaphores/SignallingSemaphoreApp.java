package com.myprograms.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class SignallingSemaphoreApp {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new Sender(semaphore), "Sender").start();
        new Thread(new Receiver(semaphore), "Receiver").start();
    }

    private static class Sender implements Runnable {
        private Semaphore semaphore;

        Sender(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    this.semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " Sending..");
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Receiver implements Runnable {
        private Semaphore semaphore;

        Receiver(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " Receiving..");
                    this.semaphore.release();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
