package com.myprograms.concurrency.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueImplWithLock {
    private Queue<Integer> list;
    private int size;
    private ReentrantLock lock = new ReentrantLock();
    private Condition emptyCondition = lock.newCondition();
    private Condition fullCondition = lock.newCondition();

    public BlockingQueueImplWithLock(int size) {
        this.list = new LinkedList<>();
        this.size = size;
    }

    public void add(int value) throws InterruptedException {
        try {
            lock.lock();
            while (list.size() >= size) {
                fullCondition.await();
            }
            list.add(value);
            emptyCondition.signalAll();
        }
        finally {
            lock.unlock();
        }
    }

    public int poll() throws InterruptedException {
        try {
            lock.lock();
            while (list.size() == 0) {
                emptyCondition.await();
            }
            int value = list.poll();
            fullCondition.signalAll();
            return value;
        }
        finally {
            lock.unlock();
        }
    }
}
