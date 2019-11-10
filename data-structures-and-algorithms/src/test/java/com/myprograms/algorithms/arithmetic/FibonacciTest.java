package com.myprograms.algorithms.arithmetic;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void getFibonacci() {
        int n = 11;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        Assert.assertEquals(89, Fibonacci.getFibonacci(n));
        Assert.assertEquals(89, Fibonacci.getFibonacci(n, memo));
        Assert.assertEquals(89, Fibonacci.getFibonacciWithSpaceOptimized(n));
        Assert.assertEquals(89, Fibonacci.getFibonacciUsingGoldenRatio(n));
    }

    @Test
    public void getIndexOfFibonacci() {
        int n = 89;

        Assert.assertEquals(11, Fibonacci.getIndexOfGivenFibonacci(n));
        Assert.assertEquals(11, Fibonacci.getIndexOfGivenFibonacciUsingFormula(n));
    }

    @Test
    public void isFibonacci() {
        int n = 89;

        Assert.assertTrue(Fibonacci.isFibonacci(n));
        Assert.assertFalse(Fibonacci.isFibonacci(n + 1));

        Assert.assertTrue(Fibonacci.isFibonacciUsingFormula(n));
        Assert.assertFalse(Fibonacci.isFibonacciUsingFormula(n + 1));
    }

    @Test
    public void isMthFibonacciDividesNth() {
        int m = 3, n = 9;
        Assert.assertTrue(Fibonacci.getFibonacci(n) % Fibonacci.getFibonacci(m) == 0);
        Assert.assertTrue(Fibonacci.isMthFibonacciDividesNth(m, n));
    }
}