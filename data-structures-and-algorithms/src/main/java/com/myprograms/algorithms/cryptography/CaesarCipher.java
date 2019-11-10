package com.myprograms.algorithms.cryptography;

public class CaesarCipher {
    public String encrypt(String word, int rotation) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 1; j <= rotation; j++) {
                if ((letters[i] >= 'a' && letters[i] < 'z') || (letters[i] >= 'A' && letters[i] < 'Z')) {
                    letters[i]++;
                    continue;
                }
                if (letters[i] == 'z') letters[i] = 'a';
                if (letters[i] == 'Z') letters[i] = 'A';
            }
        }
        return String.valueOf(letters);
    }

    public String encryptTextAlone(String text, int rotation) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        rotation - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        rotation - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
