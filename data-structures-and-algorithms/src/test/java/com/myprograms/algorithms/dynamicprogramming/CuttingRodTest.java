package com.myprograms.algorithms.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuttingRodTest {

    @Test
    public void findMaxPriceWithOptimalRodCut() {
        int price[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        assertEquals("Max value is wrong",22, new CuttingRod().findMaxPriceWithOptimalRodCut(price,price.length));
    }

    @Test
    public void findMaxPriceWithOptimalRodCutUsingDp() {
        int price[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        assertEquals("Max value is wrong",22, new CuttingRod().findMaxPriceWithOptimalRodCutUsingDp(price));
    }

    @Test
    public void findOptimalRodCuttingPriceForGivenLength() {
        int price[] = new int[] {0, 1, 5, 8, 9, 10, 17, 17, 20};
        int lengthRequired = 8;
        new CuttingRod().findOptimalRodCuttingPriceForGivenLength(price, lengthRequired);

        System.out.println();

        price = new int[] {0, 2,5,7,3};
        lengthRequired = 5;
        new CuttingRod().findOptimalRodCuttingPriceForGivenLength(price, lengthRequired);
    }
}