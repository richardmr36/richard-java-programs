package com.myprograms.solidprinciples.ocp.demo;

import com.myprograms.solidprinciples.ocp.gooddesign.Graphic;
import com.myprograms.solidprinciples.ocp.gooddesign.Rectangle;
import com.myprograms.solidprinciples.ocp.gooddesign.Square;
import com.myprograms.solidprinciples.ocp.gooddesign.Circle;

/*The Open Closed Principle
 * Open for Extension - The behaviour of the module can be extended
 * Closed for Modification - No one is allowed to make source code changes to it
 *
 * In a well-designed program, new features are added by adding new code, rather than by changing old working code
 *
 * Here we will include a new requirement Circle
 *  */

public class GoodDesignDemo {
    public static void main(String[] arg) {
        Graphic graphic = new Graphic();
        graphic.draw(new Square());
        graphic.draw(new Rectangle());
        graphic.draw(new Circle());
    }
}
