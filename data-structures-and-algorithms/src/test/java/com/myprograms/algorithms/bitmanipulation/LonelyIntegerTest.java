package com.myprograms.algorithms.bitmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class LonelyIntegerTest {

    @Test
    public void findLonelyInteger() {
        int[] values = {2,1,4,23,2,1,23};
        int result = 4;
        assertEquals("Lonely Integer is not found",result,new LonelyInteger().findLonelyInteger(values));
    }
}