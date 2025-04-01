package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MinFlipsTest {

  @Test
  public void test() {
    Assert.assertEquals(3, MinFlips.find(2, 6, 5));
  }
}