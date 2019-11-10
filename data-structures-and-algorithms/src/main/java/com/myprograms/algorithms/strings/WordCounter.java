package com.myprograms.algorithms.strings;

import com.myprograms.algorithms.utility.StringUtility;

public class WordCounter {
    public static int countNoOfWordsInCamelCaseWord(String camelCaseWord) {
        if (StringUtility.isEmpty(camelCaseWord))
            return 0;

        final char[] letters = camelCaseWord.toCharArray();
        int count = 1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'A' && letters[i] <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int countNoOfWords(String sentence) {
        if (StringUtility.isEmpty(sentence))
            return 0;
        return sentence.trim().split("[\\s]+").length;
    }
}
