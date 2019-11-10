package com.myprograms.algorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {

    public boolean validateIpAddress(String ip) {
        final String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        if(ip.matches(pattern))
            return true;
        return false;
    }
}
