package com.myprograms.algorithms.geometric;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointInsidePolygonCheckerTest {

    @Test
    public void isPointLieInsidePolygon() {
        Point[] vertices = {
                new Point(0,0),
                new Point(10,0),
                new Point(10,10),
                new Point(0,10)
        };

        Polygon polygon = new Polygon(vertices);
        Point p = new Point(20,20);
        assertFalse("Point p does not lie within polygon", new PointInsidePolygonChecker().isPointLieInsidePolygon(polygon,p));

        p = new Point(5,5);
        assertFalse("Point p lies within polygon", new PointInsidePolygonChecker().isPointLieInsidePolygon(polygon,p));
    }
}