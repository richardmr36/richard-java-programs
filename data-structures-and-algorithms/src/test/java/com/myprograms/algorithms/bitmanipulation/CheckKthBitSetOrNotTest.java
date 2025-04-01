package com.myprograms.algorithms.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class CheckKthBitSetOrNotTest {

  @Test
  public void testCheckUsingLeftShift() {
    Assert.assertTrue(CheckKthBitSetOrNot.checkUsingLeftShift(10, 2));
  }

  @Test
  public void testCheckUsingRightShift() {
    Assert.assertTrue(CheckKthBitSetOrNot.checkUsingRightShift(10, 2));
  }
}