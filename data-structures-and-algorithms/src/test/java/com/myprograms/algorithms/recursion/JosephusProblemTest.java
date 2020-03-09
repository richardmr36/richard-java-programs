package com.myprograms.algorithms.recursion;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JosephusProblemTest {

    @Test
    public void findJosephusPosition() {
        Assert.assertEquals(17, JosephusProblem.findJosephusPosition(40 ,2));
    }
}