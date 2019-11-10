package com.myprograms.algorithms.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterCounter {
    public static int countUsingRegularExpressions(String str, String regex) {
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) count++;
        return count;
    }

    public static int countUsingLambda(String str, char c) {
        long count = str.chars().filter(ch -> ch == c).count();
        return (int)count;
    }

    public static int countTotalChars(String str) {
        str = str.replaceAll("\\s","");
        return str.length();
    }
}
