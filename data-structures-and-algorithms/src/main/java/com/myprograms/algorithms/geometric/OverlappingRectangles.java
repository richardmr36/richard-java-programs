package com.myprograms.algorithms.geometric;

import static java.lang.Math.*;

public class OverlappingRectangles {
    public boolean checkIfTwoRectanglesOverlap(Rectangle1 r1, Rectangle1 r2) {
        if (r1.topLeft.x > r2.bottomRight.x || r2.topLeft.x > r1.bottomRight.x)
            return false;

        if (r1.topLeft.y < r2.bottomRight.y || r2.topLeft.y < r1.bottomRight.y)
            return false;

        return true;
    }

    public int findAreaOfTwoOverlappingRectangles(Rectangle2 r1, Rectangle2 r2) {
        int area1 = abs(r1.bottomLeft.x - r1.topRight.x) * abs(r1.bottomLeft.y - r1.topRight.y);
        int area2 = abs(r2.bottomLeft.x - r2.topRight.x) * abs(r2.bottomLeft.y - r2.topRight.y);

        int areaOfIntersection = (min(r1.topRight.x, r2.topRight.x) - max(r1.bottomLeft.x, r2.bottomLeft.x)) *
                (min(r1.topRight.y, r2.topRight.y) - max(r1.bottomLeft.y, r2.bottomLeft.y));

        return area1 + area2 - areaOfIntersection;
    }
}
