package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SwapNumbersTest {

  @Test
  public void swap() {
    Assert.assertEquals("2,1", SwapNumbers.swap(1, 2));
  }
}