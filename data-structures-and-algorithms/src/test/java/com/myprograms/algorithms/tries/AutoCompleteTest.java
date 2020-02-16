package com.myprograms.algorithms.tries;

import org.junit.Assert;
import org.junit.Test;

public class AutoCompleteTest {

    @Test
    public void findCount() {
        String[] input = {"code", "coding"};
        AutoComplete trie = new AutoComplete(input);
        Assert.assertEquals(2, trie.findCountWithGivenPrefix("cod"));
        Assert.assertEquals(0, trie.findCountWithGivenPrefix("coe"));
    }

    @Test
    public void findWords() {
        String[] input = {"code", "coding"};
        AutoComplete trie = new AutoComplete(input);
        String[] expected = {"code", "coding"};
        Assert.assertArrayEquals(expected, trie.find("cod"));
        Assert.assertArrayEquals(new String[0], trie.find("coe"));
    }
}