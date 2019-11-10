package com.myprograms.algorithms.patternsearching;

import java.util.ArrayList;
import java.util.List;

import com.myprograms.algorithms.utility.ArrayUtility;

public class NaivePatternSearcher {
    public static int[] search(String str, String pattern) {
        List<Integer> indexResultsList = new ArrayList<>();
        int strLength = str.length();
        int patternLength = pattern.length();

        for (int i = 0; i < strLength - patternLength; i++) {
            int j = 0;
            while (j < patternLength) {
                if (str.charAt(i + j) != pattern.charAt(j))
                    break;
                j++;
            }

            if (j == patternLength)
                indexResultsList.add(i);
        }

        return ArrayUtility.listToIntArray(indexResultsList);
    }

    public static int[] optimizedSearchWhenPatternHasUniqueChars(String str, String pattern) {
        List<Integer> indexResultsList = new ArrayList<>();
        int strLength = str.length();
        int patternLength = pattern.length();
        int i = 0;
        while (i <= strLength - patternLength) {
            int j = 0;
            while (j < patternLength) {
                if (str.charAt(i + j) != pattern.charAt(j))
                    break;
                j++;
            }

            if (j == patternLength) {
                indexResultsList.add(i);
                i += patternLength;
            }
            else if (j == 0)
                i++;
            else
                i = i + j;
        }

        return ArrayUtility.listToIntArray(indexResultsList);
    }
}
