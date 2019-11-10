package com.myprograms.designpatterns.gangoffour.creational.singleton;

public class ThreadSafeSingletonUsingDCL {
    private static ThreadSafeSingletonUsingDCL instance;

    private ThreadSafeSingletonUsingDCL() {
    }

    public static ThreadSafeSingletonUsingDCL getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonUsingDCL();
                }
            }
        }
        return instance;
    }
}
