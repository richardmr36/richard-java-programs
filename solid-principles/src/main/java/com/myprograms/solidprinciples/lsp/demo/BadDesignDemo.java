package com.myprograms.solidprinciples.lsp.demo;

import com.myprograms.solidprinciples.lsp.baddesign.Rectangle;
import com.myprograms.solidprinciples.lsp.baddesign.Square;

/*Liskov Substitution Principle
* Functions that use pointers to base classes must be able to use objects of derived classes without knowing it
* */
public class BadDesignDemo {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(3);
        System.out.println("Area is "+square.getArea());
        System.out.println();
        testRectangle(square);
    }

    /*This Square and Rectangle design violates the LSP.
    * The solution is that Square should not inherit from Rectangle. We have to create a base class called Shape.
    * Square and Rectangle will inherit from Shape.*/
    public static void testRectangle(Rectangle rectangle) {
        rectangle.setHeight(6);
        rectangle.setWidth(10);
        System.out.println("The expected result is 60. But the actual result is "+rectangle.getArea());
    }
}
