package com.myprograms.concurrency.threads.threadlocal;

public class SimpleThreadLocal {
    private static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new SimpleThreadLocalRunnable()).start();
    }

    private static class SimpleThreadLocalRunnable implements Runnable {
        @Override
        public void run() {
            int random = (int) (Math.random() * 100);
            System.out.println("Thread " + Thread.currentThread().getName() + " setting int : " + random);
            SimpleThreadLocal.threadLocal.set(random);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " retrieving int : " + SimpleThreadLocal.threadLocal.get());
        }
    }
}
