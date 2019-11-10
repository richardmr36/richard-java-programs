package com.myprograms.designpatterns.gangoffour.creational.abstractfactory;


public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}
