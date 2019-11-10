package com.myprograms.algorithms.general;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void isPrime() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertTrue(primeNumbers.isPrime(1000000007));
    }
}