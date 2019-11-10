package com.myprograms.algorithms.geometric;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LineIntersection {

    /*https://www.geeksforgeeks.org/check-if-two-given-line-segments-intersect/*/

    Orientation orientation = new Orientation();

    public boolean checkIfTwoLineSegmentsIntersect(Point p11, Point p12, Point p21, Point p22) {
        final String o1 = orientation.findOrientationOfThreeOrderedPoints(p11, p12, p21);
        final String o2 = orientation.findOrientationOfThreeOrderedPoints(p11, p12, p22);
        final String o3 = orientation.findOrientationOfThreeOrderedPoints(p21, p22, p11);
        final String o4 = orientation.findOrientationOfThreeOrderedPoints(p21, p22, p12);

        if (!o1.equals(o2) && !o3.equals(o4))
            return true;

        if(o1.equals(Orientation.CO_LINEAR) && checkIfPointLiesOnLineSegment(p11, p21, p12))
            return true;

        if(o2.equals(Orientation.CO_LINEAR) && checkIfPointLiesOnLineSegment(p11, p22, p12))
            return true;

        if(o3.equals(Orientation.CO_LINEAR) && checkIfPointLiesOnLineSegment(p21, p11, p22))
            return true;

        if(o4.equals(Orientation.CO_LINEAR) && checkIfPointLiesOnLineSegment(p21, p12, p22))
            return true;

        return false;
    }

    public boolean checkIfPointLiesOnLineSegment(Point p, Point q, Point r) {
        if (q.x <= max(p.x, r.x) && q.x >= min(p.x, r.x) &&
                q.y <= max(p.y, r.y) && q.y >= min(p.y, r.y))
            return true;

        return false;
    }
}
