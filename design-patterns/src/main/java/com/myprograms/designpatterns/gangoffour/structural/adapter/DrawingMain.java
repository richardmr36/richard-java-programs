package com.myprograms.designpatterns.gangoffour.structural.adapter;

import com.myprograms.designpatterns.gangoffour.structural.adapter.client.Drawing;
import com.myprograms.designpatterns.gangoffour.structural.adapter.domaintarget.Circle;
import com.myprograms.designpatterns.gangoffour.structural.adapter.domaintarget.Rectangle;

public class DrawingMain {
    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");

        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();

        System.out.println("Resizing...");
        drawing.resize();
    }
}
