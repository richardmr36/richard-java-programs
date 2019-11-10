package com.myprograms.algorithms.geometric;

import com.myprograms.algorithms.arithmetic.GreatestCommonDivisor;

public class RectangleIntoSquares {
    public int findNoOfSquaresThatCanBeCutFromRectangle(int length, int breadth) {
        return new GreatestCommonDivisor().findGreatestCommonDivisor(length, breadth);
    }
}
