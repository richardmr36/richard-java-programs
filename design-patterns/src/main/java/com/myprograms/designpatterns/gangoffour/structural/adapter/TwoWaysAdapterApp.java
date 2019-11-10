package com.myprograms.designpatterns.gangoffour.structural.adapter;

import com.myprograms.designpatterns.gangoffour.structural.adapter.client.Drawing;
import com.myprograms.designpatterns.gangoffour.structural.adapter.twowaysadapter.ShapeType;
import com.myprograms.designpatterns.gangoffour.structural.adapter.twowaysadapter.TwoWaysAdapter;

public class TwoWaysAdapterApp {
    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");

        Drawing drawing = new Drawing();
        drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));

        System.out.println("Drawing...");
        drawing.draw();

        System.out.println("Resizing...");
        drawing.resize();
    }
}
