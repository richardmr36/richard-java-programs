package com.myprograms.algorithms.tries;

import java.util.HashMap;

class TrieNode1 {
    private HashMap<Character, TrieNode1> children = new HashMap<>();
    public int size;

    public void putChildIfAbsent(char ch) {
        children.putIfAbsent(ch, new TrieNode1());
    }

    public TrieNode1 getChild(char ch) {
        return children.get(ch);
    }
}

public class ContactsNameCount {
    TrieNode1 root = new TrieNode1();

    public ContactsNameCount(){} // default constructor

    public ContactsNameCount(String[] words) {
        for (String word : words) {
            add(word);
        }
    }

    public void add(String str) {
        TrieNode1 curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.putChildIfAbsent(ch);
            curr = curr.getChild(ch);
            curr.size++;
        }
    }

    public int find(String prefix) {
        TrieNode1 curr = root;

        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            curr = curr.getChild(ch);
            if (curr == null) {
                return 0;
            }
        }
        return curr.size;
    }
}
