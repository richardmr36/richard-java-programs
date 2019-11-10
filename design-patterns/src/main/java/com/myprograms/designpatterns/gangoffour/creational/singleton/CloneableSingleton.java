package com.myprograms.designpatterns.gangoffour.creational.singleton;

public class CloneableSingleton implements Cloneable {

    public static CloneableSingleton getInstance() {
        return SingletonHelper.instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    private static class SingletonHelper {
        private static final CloneableSingleton instance = new CloneableSingleton();
    }
}
