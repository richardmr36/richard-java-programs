package com.myprograms.algorithms.strings;

public class Pangram {
    public boolean checkForPangram(String sentence) {
        String aToZ = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase();
        for(int i = 0; i< aToZ.length(); i++) {
            if(!sentence.contains(aToZ.charAt(i)+"")) {
                return false;
            }
        }
        return true;
    }
}
