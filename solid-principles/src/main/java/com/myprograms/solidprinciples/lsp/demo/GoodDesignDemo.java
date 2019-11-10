package com.myprograms.solidprinciples.lsp.demo;

import com.myprograms.solidprinciples.lsp.gooddesign.Rectangle;
import com.myprograms.solidprinciples.lsp.gooddesign.Shape;
import com.myprograms.solidprinciples.lsp.gooddesign.Square;

public class GoodDesignDemo {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(3);
        System.out.println("Area of square is "+square.getArea());
        testSquare(square);

        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(6);
        rectangle.setWidth(10);
        System.out.println("Area of rectange is "+rectangle.getArea());
        testRectangle(rectangle);

    }

    public static void testSquare(Shape shape) {
        System.out.println("The expected result is 9. But the actual result is "+shape.getArea());
    }

    public static void testRectangle(Shape shape) {
        System.out.println("The expected result is 60. But the actual result is "+shape.getArea());
    }
}
