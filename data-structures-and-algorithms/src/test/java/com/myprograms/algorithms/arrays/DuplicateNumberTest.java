package com.myprograms.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateNumberTest {

    @Test
    public void findDuplicateNoBetweenOneAndN() {
        int[] arr = {2, 5, 3, 1, 4, 3};
        int duplicate = 3;
        Assert.assertEquals("Duplicate not found", duplicate, DuplicateNumber.findDuplicateNoBetweenOneAndN(arr));
    }

    @Test
    public void findDuplicateNoBetweenOneAndNUsingFloydAlgorithm() {
        int[] arr = {2, 5, 3, 1, 4, 3};
        int duplicate = 3;
        Assert.assertEquals("Duplicate not found", duplicate, DuplicateNumber.findDuplicateNoBetweenOneAndNUsingFloydAlgorithm(arr));
    }
}