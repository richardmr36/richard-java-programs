package com.myprograms.algorithms.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StockSpanProblemTest {

    @Test
    public void findStockSpanUsingStack() {
        int[] price = {10, 4, 5, 90, 120, 80};
        int[] result = {1, 1, 2, 4, 5, 1};
        assertArrayEquals("Stock Span are wrong", result, StockSpanProblem.findStockSpanUsingStack(price));
    }

    @Test
    public void findStockSpanUsingLoop() {
        int[] price = {10, 4, 5, 90, 120, 80};
        int[] result = {1, 1, 2, 4, 5, 1};
        assertArrayEquals("Stock Span are wrong", result, StockSpanProblem.findStockSpanUsingLoop(price));
    }
}