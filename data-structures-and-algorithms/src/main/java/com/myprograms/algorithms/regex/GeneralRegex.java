package com.myprograms.algorithms.regex;

import java.util.regex.Pattern;

public class GeneralRegex {
    public boolean matchUsername(String username) {
        final String regex = "^[a-zA-Z]{1}+[a-zA-Z0-9_]{7,29}+$";
        if(username.matches(regex))
            return true;
        return false;
    }
}
