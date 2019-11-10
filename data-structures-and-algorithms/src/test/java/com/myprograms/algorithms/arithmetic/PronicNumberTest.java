package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PronicNumberTest {

    PronicNumber pronicNumber = new PronicNumber();

    @Test
    public void generate() {
        System.out.println(pronicNumber.generate(5));
    }

    @Test
    public void validate() {
        assertTrue(pronicNumber.validate(30));
        assertFalse(pronicNumber.validate(36));
    }
}