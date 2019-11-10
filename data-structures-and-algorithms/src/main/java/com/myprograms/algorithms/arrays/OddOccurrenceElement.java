package com.myprograms.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrenceElement {
    public int loopToFindElementWithOddNoOfOccurrences(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }

        return -1;
    }

    public int mapToFindElementWithOddNoOfOccurrences(int[] arr) {
        Map<Integer,Integer> countMap = new HashMap<>(arr.length);

        for(int i=0;i<arr.length;i++) {
            int count = 0;
            if(countMap.containsKey(arr[i]))
               count = countMap.get(arr[i]);

            countMap.put(arr[i], count+1);
        }

        for(Integer key : countMap.keySet()) {
            if(countMap.get(key) % 2 != 0)
                return key;
        }

        return -1;
    }

    public int xorToFindElementWithOddNoOfOccurrences(int[] arr) {
        int result = 0;
        for(int i=0;i<arr.length;i++)
            result = result ^ arr[i];

        return result;
    }

}
