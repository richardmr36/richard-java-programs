package com.myprograms.designpatterns.gangoffour.creational.abstractfactory;

public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }
}
