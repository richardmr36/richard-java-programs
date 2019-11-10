package com.myprograms.algorithms.arrays;

import static org.junit.Assert.*;

import com.myprograms.algorithms.utility.Printer;
import org.junit.Test;

public class ArrayRotationTest {

    @Test
    public void rightRotation() {
        int[] arr = {1,2,3,4,5};
        Printer.printArray(new ArrayRotation().rightRotation(arr, 1), "Right Rotated Array");
    }

    @Test
    public void leftRotation() {
        int[] arr = {1,2,3,4,5};
        Printer.printArray(new ArrayRotation().leftRotation(arr, 1), "Left Rotated Array");
    }
}