package com.myprograms.algorithms.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SmallestSubstringOfGivenChars {

    private static final int no_of_chars = 256;

    public static String getSubstringUsingSingleMap(char[] arr, String str) {
        int start = 0;
        int uniqueCounter = 0;
        int patLen = arr.length;
        String result = null;
        char headChar;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr)
            map.put(c, 0);

        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!map.containsKey(c))
                continue;

            int charCount = map.get(c);

            if (charCount == 0)
                uniqueCounter = uniqueCounter + 1;

            map.put(c, map.get(c) + 1);

            // push the head forward to make the length smaller
            while (uniqueCounter == patLen) {
                int tempLength = i - start + 1;
                if (tempLength == patLen)
                    return str.substring(start, i + 1);

                // if current length is smaller update the result
                if (result == null || tempLength < result.length()) {
                    result = str.substring(start, i + 1);
                }
                // try to make the string smaller from beginning and check
                headChar = str.charAt(start);

                // reduce headchar counter
                if (map.containsKey(headChar)) {
                    int headCount = map.get(headChar) - 1;// we are reducing
                    // after removing first character, if value is zero
                    // it means unique character count should reduced
                    if (headCount == 0) {
                        uniqueCounter = uniqueCounter - 1;
                    }

                    // update the hashMap
                    map.put(headChar, headCount);
                }

                // move head
                start = start + 1;

            }
        }
        return result;
    }

    public static String getSubstringUsingDoubleMap(char[] arr, String str) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        String str1 = "";

        for (char c : arr)
            hashMap.put(c, 0);

        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);

            if (!hashMap.containsKey(c))
                continue;

            if (hashMap.containsKey(c)) {
                if (linkedHashMap.containsKey(c)) {
                    linkedHashMap.remove(c);
                    linkedHashMap.put(c, 0);
                }
                else {
                    linkedHashMap.put(c, 0);
                }
            }
        }

        if (linkedHashMap.size() < hashMap.size()) {
            return "";
        }
        else if (linkedHashMap.size() == hashMap.size()) {
            Iterator<Map.Entry<Character, Integer>> itr = linkedHashMap.entrySet().iterator();
            while (itr.hasNext()) {
                str1 += itr.next().getKey();
            }
        }

        return str1;
    }

    public static String findSubString(String str, String pat) {
        int len1 = str.length();
        int len2 = pat.length();

        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }

        int[] hash_pat = new int[no_of_chars];
        int[] hash_str = new int[no_of_chars];

        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        // start traversing the string
        int count = 0; // count of characters
        for (int j = 0; j < len1; j++) {
            // count occurrence of characters of string
            hash_str[str.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[str.charAt(j)] != 0 &&
                    hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
                count++;

            // if all the characters are matched
            if (count == len2) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)] == 0) {

                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        return str.substring(start_index, start_index + min_len);
    }


}
