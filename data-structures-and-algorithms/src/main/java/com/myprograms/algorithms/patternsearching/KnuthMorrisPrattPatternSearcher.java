package com.myprograms.algorithms.patternsearching;

import java.util.ArrayList;
import java.util.List;

import com.myprograms.algorithms.utility.ArrayUtility;

public class KnuthMorrisPrattPatternSearcher {
    private static int[] preProcessLongestPrefixSuffixValue(String pattern) {
        int n = pattern.length();
        int[] longestPrefixSuffix = new int[n];
        longestPrefixSuffix[0] = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = longestPrefixSuffix[j - 1];

            if (pattern.charAt(i) == pattern.charAt(j))
                j++;

            longestPrefixSuffix[i] = j;
        }
        return longestPrefixSuffix;
    }

    public static int[] search(String str, String pattern) {
        List<Integer> indexResultsList = new ArrayList<>();
        int strLength = str.length();
        int patternLength = pattern.length();
        int[] longestPrefixSuffix = preProcessLongestPrefixSuffixValue(pattern);
        int j = 0;
        for (int i = 0; i < strLength; i++) {
            while (j > 0 && str.charAt(i) != pattern.charAt(j))
                j = longestPrefixSuffix[j - 1];

            if (str.charAt(i) == pattern.charAt(j))
                j++;

            if (patternLength == j) {
                indexResultsList.add(i + 1 - patternLength);
                j = longestPrefixSuffix[j - 1];
            }
        }

        return ArrayUtility.listToIntArray(indexResultsList);
    }
}
