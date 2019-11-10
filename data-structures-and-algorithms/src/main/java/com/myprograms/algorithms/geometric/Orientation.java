package com.myprograms.algorithms.geometric;

public class Orientation {

    /*https://geeksforgeeks.org/orientation-3-ordered-points/*/

    public static final String CO_LINEAR = "Co-linear";
    public static final String CLOCKWISE = "Clockwise";
    public static final String COUNTERCLOCKWISE = "CounterClockwise";

    public String findOrientationOfThreeOrderedPoints(Point p1, Point p2, Point p3) {
        int orientation = (p2.y - p1.y) * (p3.x - p2.x) - (p2.x - p1.x) * (p3.y - p2.y);
        return orientation == 0 ? CO_LINEAR : (orientation > 0 ? CLOCKWISE : COUNTERCLOCKWISE);
    }
}
