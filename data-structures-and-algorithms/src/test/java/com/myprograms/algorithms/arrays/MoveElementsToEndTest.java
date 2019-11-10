package com.myprograms.algorithms.arrays;

import com.myprograms.algorithms.utility.Printer;
import org.junit.Test;

public class MoveElementsToEndTest {

    @Test
    public void moveAllOccurrencesOfParticularElementToEnd() {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        Printer.printArray(arr,"Original Array");
        new MoveElementsToEnd().moveAllOccurrencesOfParticularElementToEnd(arr,0);
        Printer.printArray(arr, "Final Array");
    }
}