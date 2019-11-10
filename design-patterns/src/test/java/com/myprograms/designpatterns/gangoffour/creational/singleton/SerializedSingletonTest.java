package com.myprograms.designpatterns.gangoffour.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instanceOne = SerializableSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "SerializedSingletonTest.ser"));
        out.writeObject(instanceOne);
        out.close();
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "SerializedSingletonTest.ser"));
        SerializableSingleton instanceTwo = (SerializableSingleton) in.readObject();
        in.close();
        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
    }
}