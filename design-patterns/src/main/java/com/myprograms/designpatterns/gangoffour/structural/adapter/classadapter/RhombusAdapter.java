package com.myprograms.designpatterns.gangoffour.structural.adapter.classadapter;

import com.myprograms.designpatterns.gangoffour.structural.adapter.adaptee.Rhombus;
import com.myprograms.designpatterns.gangoffour.structural.adapter.domaintarget.Shape;

public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
