package com.myprograms.algorithms.tries;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AutoComplete {

    private TrieNode root = new TrieNode("");

    public AutoComplete() {
    }

    public AutoComplete(String[] words) {
        for (String word : words)
            add(word);
    }

    public void add(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.putChildIfAbsent(ch, str.substring(0, i + 1));
            curr = curr.getChild(ch);
            curr.size++;
            if (i == str.length() - 1)
                curr.isWord = true;
        }
    }

    public int findCountWithGivenPrefix(String prefix) {
        TrieNode curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            curr = curr.getChild(ch);
            if (curr == null) {
                return 0;
            }
        }
        return curr.size;
    }

    public String[] find(String prefix) {
        List<String> result = new LinkedList<>();
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            curr = curr.getChild(ch);
            if (curr == null)
                return new String[0];
        }

        findWordsWithGivenPrefix(curr, result);
        String[] arr = new String[result.size()];
        for (int i = 0; i < result.size(); i++)
            arr[i] = result.get(i);

        return arr;
    }

    private void findWordsWithGivenPrefix(TrieNode node, List<String> result) {
        if(node.isWord)
            result.add(node.prefix);

        for(Character ch : node.children.keySet())
            findWordsWithGivenPrefix(node.children.get(ch), result);
    }

    private class TrieNode {
        private int size;
        private String prefix;
        private boolean isWord;
        private Map<Character, TrieNode> children;

        public TrieNode(String prefix) {
            this.prefix = prefix;
            this.children = new HashMap<>();
        }

        public void putChildIfAbsent(char ch, String prefix) {
            children.putIfAbsent(ch, new TrieNode(prefix));
        }

        public TrieNode getChild(char ch) {
            return children.get(ch);
        }
    }
}
