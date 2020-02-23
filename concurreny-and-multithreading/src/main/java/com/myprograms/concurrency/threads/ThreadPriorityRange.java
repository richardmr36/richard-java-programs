package com.myprograms.concurrency.threads;

public class ThreadPriorityRange {
    public static void main(String[] args) {
        System.out.println("Minimal priority : " + Thread.MIN_PRIORITY);
        System.out.println("Maximal priority : " + Thread.MAX_PRIORITY);
        System.out.println("Norm priority : " + Thread.NORM_PRIORITY);

        Thread thread1 = new Thread(() -> System.out.println("Given Priority : " + Thread.currentThread().getPriority()));
        thread1.setPriority(2);
        thread1.start();

        System.out.println("Main Priority : " + Thread.currentThread().getPriority());
        Thread thread2 = new Thread(() -> System.out.println("Defaulting Priority from main thread : " + Thread.currentThread().getPriority()));
        thread2.start();
    }
}
