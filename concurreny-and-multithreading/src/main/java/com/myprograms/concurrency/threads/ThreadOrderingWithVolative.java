package com.myprograms.concurrency.threads;

public class ThreadOrderingWithVolative {
    private static volatile int counter = 0;
    private static int print = 0;

    public static void main(String[] args) {
        Thread[] ths = new Thread[4];
        for (int i = 0; i < ths.length; i++) {
            ths[i] = new Thread(new MyRunnable(i, ths.length));
            ths[i].start();
        }
    }

    private static class MyRunnable implements Runnable {
        final int thID;
        final int total;

        public MyRunnable(int id, int total) {
            thID = id;
            this.total = total;
        }

        @Override
        public void run() {
            while (true) {
                if (thID == counter) {
                    System.out.println("thread " + thID + " prints " + print);
                    print++;
                    if (print == total)
                        print = 0;
                    counter++;
                    if (counter == total)
                        counter = 0;
                }
                else {
                    try {
                        Thread.sleep(30);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
