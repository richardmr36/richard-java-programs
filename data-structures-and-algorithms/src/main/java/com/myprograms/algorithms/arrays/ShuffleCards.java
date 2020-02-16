package com.myprograms.algorithms.arrays;

import java.util.Random;

import com.myprograms.algorithms.utility.ArrayUtility;

public class ShuffleCards {
    public static int[] shuffleUsingFisherYatesAlgorithm(int[] cards) {
        int n = cards.length;
        Random random = new Random();
        for (int i = n - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            ArrayUtility.swap(cards, i, j);
        }

        return cards;
    }
}
