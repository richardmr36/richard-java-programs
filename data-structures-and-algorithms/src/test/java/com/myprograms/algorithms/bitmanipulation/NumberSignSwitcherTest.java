package com.myprograms.algorithms.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NumberSignSwitcherTest {

  @Test
  public void switchSign() {
    Assert.assertEquals(-5, NumberSignSwitcher.switchSign(5));
    Assert.assertEquals(21, NumberSignSwitcher.switchSign(-21));
  }
}