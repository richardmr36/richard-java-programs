package com.myprograms.algorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRemover {
    public String removeDuplicateWordsFromSentence(String sentence) {
        final String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find())
            sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
        return sentence;
    }
}
