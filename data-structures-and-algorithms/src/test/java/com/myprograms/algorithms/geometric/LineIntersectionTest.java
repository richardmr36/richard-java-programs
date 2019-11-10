package com.myprograms.algorithms.geometric;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineIntersectionTest {

    @Test
    public void checkIfTwoLineSegmentsIntersect() {
        Point p11 = new Point(1,1), p12 = new Point(10,1);
        Point p21 = new Point(1,2), p22 = new Point(10,2);
        assertFalse("Lines intersect",new LineIntersection().checkIfTwoLineSegmentsIntersect(p11,p12,p21,p22));

        p11 = new Point(10,0); p12 = new Point(0,10);
        p21 = new Point(0,0); p22 = new Point(10,10);
        assertTrue("Lines do not intersect",new LineIntersection().checkIfTwoLineSegmentsIntersect(p11,p12,p21,p22));
    }
}