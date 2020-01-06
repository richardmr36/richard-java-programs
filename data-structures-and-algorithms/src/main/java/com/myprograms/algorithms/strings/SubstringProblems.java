package com.myprograms.algorithms.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubstringProblems {

    private static final int CHAR_RANGE = 256;

    //Pattern:SlidingWindow
    public static String findLongestSubstringWithKUniqueChars(String str, int k) {
        int end = 0, begin = 0;

        Set<Character> window = new HashSet<>();
        int[] freq = new int[CHAR_RANGE];

        for (int low = 0, high = 0; high < str.length(); high++) {
            window.add(str.charAt(high));
            freq[str.charAt(high)]++;

            while (window.size() > k) {
                if (--freq[str.charAt(low)] == 0)
                    window.remove(str.charAt(low));

                low++;
            }

            if (end - begin < high - low) {
                end = high;
                begin = low;
            }
        }

        return str.substring(begin, end + 1);
    }

    //Pattern:SlidingWindow
    public static String findSmallestSubstringOfAllCharsPresent(String str) {
        int n = str.length();
        int distinctCharCount = getDistinctCharCount(str);

        int start = 0, windowStartIndex = -1;
        int minWindowLength = Integer.MAX_VALUE;

        int count = 0;
        int[] frequency = new int[CHAR_RANGE];
        for (int j = 0; j < n; j++) {
            frequency[str.charAt(j)]++;
            if (frequency[str.charAt(j)] == 1)
                count++;

            if (count == distinctCharCount) {
                while (frequency[str.charAt(start)] > 1) {
                    if (frequency[str.charAt(start)] > 1)
                        frequency[str.charAt(start)]--;

                    start++;
                }

                int windowLength = j - start + 1;
                if (minWindowLength > windowLength) {
                    minWindowLength = windowLength;
                    windowStartIndex = start;
                }
            }
        }

        return str.substring(windowStartIndex, windowStartIndex + minWindowLength);
    }

    private static int getDistinctCharCount(String str) {
        int distinctCharCount= 0;
        boolean[] visited = new boolean[CHAR_RANGE];
        Arrays.fill(visited, false);
        for (int i = 0; i < str.length(); i++) {
            if (visited[str.charAt(i)] == false) {
                visited[str.charAt(i)] = true;
                distinctCharCount++;
            }
        }

        return distinctCharCount;
    }

    //Pattern:SlidingWindow
    public static String findSmallestSubstringContainingAllCharsOfAnotherString(String str, String pattern) {
        //https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
        return null;
    }
}
