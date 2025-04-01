package com.myprograms.algorithms.arithmetic;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwoTest {
  @Test
  public void testFindUsingLogarithm() {
    Assert.assertEquals(true, PowerOfTwo.findUsingLogarithm(4));
  }

  @Test
  public void testFindUsingBrianKernighanAlgorithm() {
    Assert.assertEquals(true, PowerOfTwo.findUsingBrianKernighanAlgorithm(4));
  }
}