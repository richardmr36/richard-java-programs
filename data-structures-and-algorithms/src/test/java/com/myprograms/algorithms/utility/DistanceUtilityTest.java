package com.myprograms.algorithms.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceUtilityTest {

    @Test
    public void findDistanceBetweenTwoCoordinates() {
        System.out.println(DistanceUtility.findDistanceBetweenTwoCoordinatesInMiles("12.59.40N", "080.10.50E",
                "13.11.56N","077.42.20E"));

        System.out.println(DistanceUtility.findDistanceBetweenTwoCoordinatesInKm("12.59.40N", "080.10.50E",
                "13.11.56N","077.42.20E"));
    }
}