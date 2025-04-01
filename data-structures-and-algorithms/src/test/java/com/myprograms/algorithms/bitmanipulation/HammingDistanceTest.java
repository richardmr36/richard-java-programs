package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {

  @Test
  public void testFind() {
    Assert.assertEquals(2, HammingDistance.find(4, 7));
  }

  @Test
  public void testFindUsingBrianKernighanAlgorithm() {
    Assert.assertEquals(2, HammingDistance.findUsingBrianKernighanAlgorithm(4, 7));
  }
}