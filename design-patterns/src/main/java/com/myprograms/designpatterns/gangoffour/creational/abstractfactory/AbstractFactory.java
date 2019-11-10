package com.myprograms.designpatterns.gangoffour.creational.abstractfactory;


public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}
