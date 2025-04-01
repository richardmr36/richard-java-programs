package com.myprograms.algorithms.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class BitsCounterTest {

  @Test
  public void test() {
    Assert.assertEquals(7, BitsCounter.countWithRightShift(125));
  }

  @Test
  public void testCountOptimally() {
    Assert.assertEquals(7, BitsCounter.countWithLeftShift(125));
  }
}