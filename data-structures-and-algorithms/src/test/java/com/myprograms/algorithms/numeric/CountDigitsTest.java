package com.myprograms.algorithms.numeric;

import org.junit.Assert;
import org.junit.Test;

public class CountDigitsTest {

  @Test
  public void testCountUsingLoop() {
    Assert.assertEquals(4, CountDigits.countUsingLoop(1234));
  }

  @Test
  public void testCountUsingLogarithm() {
    Assert.assertEquals(4, CountDigits.countUsingLogarithm(1234));
  }

  @Test
  public void testCountUsingRecursion() {
    Assert.assertEquals(4, CountDigits.countUsingRecursion(1234));
  }

  @Test
  public void testCountUsingStringFunction() {
    Assert.assertEquals(4, CountDigits.countUsingStringFunction(1234));
  }
}