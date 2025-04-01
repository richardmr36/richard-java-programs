package com.myprograms.algorithms.stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecimalToBinaryConverterTest {

  @Test
  public void test() {
    Assert.assertEquals("1111101", DecimalToBinaryConverter.convert(125));
  }

}