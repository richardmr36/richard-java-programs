package com.myprograms.designpatterns.gangoffour.creational.abstractfactory;

public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }
}
