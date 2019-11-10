package com.myprograms.algorithms.geometric;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverlappingRectanglesTest {

    @Test
    public void checkIfTwoRectanglesOverlap() {
        Rectangle1 r1 = new Rectangle1(new Point(0,10), new Point(10,0));
        Rectangle1 r2 = new Rectangle1(new Point(5,5), new Point(15,0));
        assertTrue("Overlap is not found", new OverlappingRectangles().checkIfTwoRectanglesOverlap(r1,r2));
    }

    @Test
    public void findAreaOfTwoOverlappingRectangles() {
        Rectangle2 r1 = new Rectangle2(new Point(2,2), new Point(5,7));
        Rectangle2 r2 = new Rectangle2(new Point(3,4), new Point(6,9));
        assertEquals("Calculated area is wrong", 24, new OverlappingRectangles().findAreaOfTwoOverlappingRectangles(r1,r2));
    }
}