package com.myprograms.algorithms.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class FirstSetBitPositionTest {

  @Test
  public void testFindUsingLeftShift() {
    Assert.assertEquals(2, FirstSetBitPosition.findUsingLeftShift(10));
  }

  @Test
  public void testFindUsingRightShift() {
    Assert.assertEquals(2, FirstSetBitPosition.findUsingRightShift(10));
  }
}