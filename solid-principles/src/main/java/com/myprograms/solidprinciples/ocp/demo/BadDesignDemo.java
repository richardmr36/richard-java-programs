package com.myprograms.solidprinciples.ocp.demo;
/*The Open Closed Principal
* Open for Extension - The behaviour of the module can be extended
* Closed for Modification - No one is allowed to make source code changes to it
*
* In a well-designed program, new features are added by adding new code, rather than by changing old working code
* */

import com.myprograms.solidprinciples.ocp.baddesign.Graphic;
import com.myprograms.solidprinciples.ocp.baddesign.Square;

public class BadDesignDemo {
    public static void main(String []arg) {
        Graphic graphic = new Graphic();
        graphic.draw(new Square());
    }
}
