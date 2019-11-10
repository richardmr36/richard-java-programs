package com.myprograms.designpatterns.gangoffour.creational.singleton;

public class ThreadSafeSingletonUsingSynchronizedMethod {
    private static ThreadSafeSingletonUsingSynchronizedMethod instance;

    private ThreadSafeSingletonUsingSynchronizedMethod() {
    }

    public static synchronized ThreadSafeSingletonUsingSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonUsingSynchronizedMethod();
        }
        return instance;
    }
}
