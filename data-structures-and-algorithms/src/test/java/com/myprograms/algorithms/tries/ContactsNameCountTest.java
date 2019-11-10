package com.myprograms.algorithms.tries;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactsNameCountTest {

    @Test
    public void findContacts() {
        String[] input = {"add code","add coding","find cod", "find cot"};
        ContactsNameCount trie = new ContactsNameCount();
        for (int i = 0; i < input.length; i++) {
            String operation = input[i].split(" ")[0];
            String contact   = input[i].split(" ")[1];
            if (operation.equals("add")) {
                trie.add(contact);
            } else if (operation.equals("find")) {
                System.out.println(trie.find(contact));
            }
        }
    }
}