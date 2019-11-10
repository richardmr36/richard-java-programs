package com.myprograms.designpatterns.miscellaneous.nullobject;

public class NullShape implements Shape {
    // no sides
    @Override
    public double area() {
        return 0.0d;
    }

    @Override
    public double perimeter() {
        return 0.0d;
    }

    @Override
    public void draw() {
        System.out.println("Null object can't be draw");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}