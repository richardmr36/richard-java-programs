package com.myprograms.designpatterns.gangoffour.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final SerializableSingleton instance = new SerializableSingleton();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
