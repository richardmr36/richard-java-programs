package com.myprograms.designpatterns.gangoffour.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}
