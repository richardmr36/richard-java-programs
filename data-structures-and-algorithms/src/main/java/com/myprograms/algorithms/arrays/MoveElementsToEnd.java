package com.myprograms.algorithms.arrays;

import com.myprograms.algorithms.utility.ArrayUtility;

public class MoveElementsToEnd {
    public void moveAllOccurrencesOfParticularElementToEnd(int[] arr, int k) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=k) {
                ArrayUtility.swap(arr,i,count++);
            }
        }
    }
}
