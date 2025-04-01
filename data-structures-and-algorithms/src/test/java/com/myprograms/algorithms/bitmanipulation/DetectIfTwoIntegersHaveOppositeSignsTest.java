package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DetectIfTwoIntegersHaveOppositeSignsTest {

  @Test
  public void detect() {
    Assert.assertTrue(DetectIfTwoIntegersHaveOppositeSigns.detect(10, -10));
  }
}