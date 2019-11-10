package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyCounterTest {

    @Test
    public void countFrequencyOfArrayElementsWithMaxValueEqualToArraySize() {
        int arr[] = {2, 3, 3, 2, 5};
        new FrequencyCounter().countFrequencyOfArrayElementsWithMaxValueEqualToArraySize(arr);
    }

    @Test
    public void countFrequencyOfArrayElementsWithMaxValueEqualToArraySiz_1() {
        int arr[] = {2, 3, 3, 2, 5};
        new FrequencyCounter().countFrequencyOfArrayElementsWithMaxValueEqualToArraySize_1(arr);
    }
}