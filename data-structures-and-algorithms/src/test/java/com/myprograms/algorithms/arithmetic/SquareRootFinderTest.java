package com.myprograms.algorithms.arithmetic;

import org.junit.Assert;
import org.junit.Test;

public class SquareRootFinderTest {

    @Test
    public void findSquareRootUsingBabylonianMethod() {
        Assert.assertEquals(2, SquareRootFinder.findSquareRootUsingBabylonianMethod(4), 0.0001);
    }
}