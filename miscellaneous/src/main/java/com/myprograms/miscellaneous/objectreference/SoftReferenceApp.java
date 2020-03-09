package com.myprograms.miscellaneous.objectreference;

import java.lang.ref.SoftReference;

public class SoftReferenceApp {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("Instance: " + object);

        SoftReference<Object> softReference = new SoftReference<>(object);
        object = null;
        System.gc();

        System.out.println("Instance: " + softReference.get());
    }
}
