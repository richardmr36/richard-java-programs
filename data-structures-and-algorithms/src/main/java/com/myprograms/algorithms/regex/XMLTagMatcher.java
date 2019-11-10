package com.myprograms.algorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLTagMatcher {
    public String getTagValues(String str) {
        String data = null;
        final String regex = "<[^>]*>(.*?)<[^>]*>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            return matcher.group(1);
        return null;
    }
}
