package com.myprograms.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrenceElementTest {

    @Test
    public void loopToFindElementWithOddNoOfOccurrences() {
        int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int result = 5;
        assertEquals("Odd occurrence element is not found",result, new OddOccurrenceElement().loopToFindElementWithOddNoOfOccurrences(arr));
    }

    @Test
    public void mapToFindElementWithOddNoOfOccurrences() {
        int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int result = 5;
        assertEquals("Odd occurrence element is not found",result, new OddOccurrenceElement().mapToFindElementWithOddNoOfOccurrences(arr));
    }

    @Test
    public void xorToFindElementWithOddNoOfOccurrences() {
        int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int result = 5;
        assertEquals("Odd occurrence element is not found",result, new OddOccurrenceElement().xorToFindElementWithOddNoOfOccurrences(arr));
    }
}