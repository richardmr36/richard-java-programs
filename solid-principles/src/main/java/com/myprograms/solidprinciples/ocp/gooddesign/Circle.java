package com.myprograms.solidprinciples.ocp.gooddesign;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw Circle!");
    }
}
