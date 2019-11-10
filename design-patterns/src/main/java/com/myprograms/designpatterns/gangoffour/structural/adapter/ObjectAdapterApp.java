package com.myprograms.designpatterns.gangoffour.structural.adapter;

import com.myprograms.designpatterns.gangoffour.structural.adapter.adaptee.Rhombus;
import com.myprograms.designpatterns.gangoffour.structural.adapter.adaptee.Triangle;
import com.myprograms.designpatterns.gangoffour.structural.adapter.client.Drawing;
import com.myprograms.designpatterns.gangoffour.structural.adapter.domaintarget.Circle;
import com.myprograms.designpatterns.gangoffour.structural.adapter.domaintarget.Rectangle;
import com.myprograms.designpatterns.gangoffour.structural.adapter.objectadapter.GeometricShapeObjectAdapter;

public class ObjectAdapterApp {
    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");

        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawing...");
        drawing.draw();

        System.out.println("Resizing...");
        drawing.resize();
    }
}
