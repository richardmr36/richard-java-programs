package com.myprograms.algorithms.arrays;

import com.myprograms.algorithms.utility.ArrayUtility;
import org.junit.Test;

public class MinimumSwapsTest {

    @Test
    public void noOfSwapsToSortFirst_N_Numbers() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(new MinimumSwaps().noOfSwapsToSortFirst_N_Numbers(arr));
    }
}