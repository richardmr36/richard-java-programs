package com.myprograms.algorithms.tries;

import java.util.HashMap;

public class LongestPrefixTrie {

    private class TrieNode {
        private char value;
        private HashMap<Character, TrieNode> children;
        private boolean bIsEnd;

        public TrieNode(char ch) {
            value = ch;
            children = new HashMap<>();
            bIsEnd = false;
        }

        public HashMap<Character, TrieNode> getChildren() {
            return children;
        }

        public char getValue() {
            return value;
        }

        public void setIsEnd(boolean val) {
            bIsEnd = val;
        }

        public boolean isEnd() {
            return bIsEnd;
        }
    }

    private TrieNode root;

    public LongestPrefixTrie() {
        this.root = new TrieNode((char) 0);
    }

    public LongestPrefixTrie(String[] arr) {
        this.root = new TrieNode((char) 0);
        for(String word : arr)
            insert(word);
    }

    public void insert(String word) {

        int length = word.length();
        TrieNode crawl = root;

        for (int level = 0; level < length; level++) {
            HashMap<Character, TrieNode> child = crawl.getChildren();
            char ch = word.charAt(level);

            if (child.containsKey(ch))
                crawl = child.get(ch);
            else  {
                TrieNode temp = new TrieNode(ch);
                child.put(ch, temp);
                crawl = temp;
            }
        }

        crawl.setIsEnd(true);
    }

    public String getMatchingPrefix(String input) {
        String result = "";
        int length = input.length();
        TrieNode crawl = root;

        int level, prevMatch = 0;
        for (level = 0; level < length; level++) {
            char ch = input.charAt(level);
            HashMap<Character, TrieNode> child = crawl.getChildren();

            if (child.containsKey(ch)) {
                result += ch;
                crawl = child.get(ch);

                if (crawl.isEnd())
                    prevMatch = level + 1;
            }
            else
                break;
        }

        // If the last processed character did not match end of a word,
        // return the previously matching prefix
        if (!crawl.isEnd())
            return result.substring(0, prevMatch);

        return result;
    }
}
