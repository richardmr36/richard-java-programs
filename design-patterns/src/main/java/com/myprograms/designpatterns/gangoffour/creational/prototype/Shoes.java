package com.myprograms.designpatterns.gangoffour.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Shoes implements Serializable, Cloneable {
    private static final long serialVersionUID = -1937047519230746677L;

    abstract void wear();

    public Object shallowCloning() throws CloneNotSupportedException {
        return this.clone();
    }

    public Shoes deepCloning() throws IOException, ClassNotFoundException {
        //Serialization of object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);

        //De-serialization of object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        Shoes clonedShoes = (Shoes) in.readObject();
        return clonedShoes;
    }
}
