package com.myprograms.algorithms.regex;

import org.junit.Test;

import static org.junit.Assert.*;

public class IPAddressTest {

    @Test
    public void validateIpAddress() {
        String ip = "0.0.0.255";
        assertTrue("Invalid IP address", new IPAddress().validateIpAddress(ip));
    }
}