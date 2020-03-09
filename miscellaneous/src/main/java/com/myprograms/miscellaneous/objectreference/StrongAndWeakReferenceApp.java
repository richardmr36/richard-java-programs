package com.myprograms.miscellaneous.objectreference;

import java.lang.ref.WeakReference;

public class StrongAndWeakReferenceApp {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("Instance: " + object);

        WeakReference<Object> weakReference = new WeakReference<>(object);
        object = null;
        //System.gc();
        Object strongReference = weakReference.get();
        System.out.println("Instance: " + strongReference);

        strongReference = null;
        System.gc();
        System.out.println("Instance: " + weakReference.get());
    }
}
