package com.myprograms.algorithms.geometric;

public class PointInsidePolygonChecker {

    /*https://geeksforgeeks.org/how-to-check-if-a-given-point-lies-inside-a-polygon/*/

    Orientation orientation = new Orientation();
    LineIntersection lineIntersection = new LineIntersection();
    final int INFINITY = Integer.MAX_VALUE;

    public boolean isPointLieInsidePolygon(Polygon polygon, Point p) {

        if(polygon.noOfVertices < 3)
            return false;

        int count = 0;
        Point extreme = new Point(INFINITY, p.y);
        for(int i=0, next=(i+1)%polygon.noOfVertices; i!=next;i=next) {
            if(lineIntersection.checkIfTwoLineSegmentsIntersect(polygon.vertex[i],polygon.vertex[next],p,extreme)) {
                if(Orientation.CO_LINEAR.equals(orientation.findOrientationOfThreeOrderedPoints(polygon.vertex[i],p,polygon.vertex[next]))) {
                    return lineIntersection.checkIfPointLiesOnLineSegment(polygon.vertex[i],p,polygon.vertex[next]);
                }
                count++;
            }
        }

        return count%2 == 1;
    }

}
