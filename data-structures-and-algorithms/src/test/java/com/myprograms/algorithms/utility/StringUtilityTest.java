package com.myprograms.algorithms.utility;

import static org.junit.Assert.*;

import com.myprograms.algorithms.general.PrimeNumbers;
import org.junit.Test;

public class StringUtilityTest {

    @Test
    public void split() {
        Printer.printArray(StringUtility.split("12345","1"));
        Printer.printArray("12345".split("1"));
    }
}