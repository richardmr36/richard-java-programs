package com.myprograms.solidprinciples.ocp.baddesign;

public class Graphic {

    /*We have to change this draw() method whenever a new type such as Circle is added to
    * This is against the OCP (should not modify the function when we change the requirement)*/
    public void draw(Shape shape) {
        if (shape.mType == 1) {
            drawSquare(shape);
        } else if (shape.mType == 2) {
            drawRectangle(shape);
        }
    }

    private void drawSquare(Shape shape) {
        System.out.println("Draw Square!");
    }

    private void drawRectangle(Shape shape) {
        System.out.println("Draw Rectangle!");
    }
}
