package com.myprograms.miscellaneous.interviewquestions;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TrickyProgramsTest {

    @Test
    public void compareDoubleMinValueWithZero() {
        System.out.println(TrickyPrograms.compareDoubleMinValueWithZero());
    }

    @Ignore
    @Test
    public void systemExitOnTryCatch() {
        TrickyPrograms.systemExitOnTryCatch();
    }

    @Test
    public void divideByZeroDoubleValue() {
        System.out.println(TrickyPrograms.divideByZeroDoubleValue());
    }

    @Test
    public void checkForNaNForDoubleValues() {
        Double x = new Double(0.0/0.0);
        assertFalse(x == Double.NaN); //Equal to operator will not work to check NaN
        assertTrue(x.isNaN());
    }
}