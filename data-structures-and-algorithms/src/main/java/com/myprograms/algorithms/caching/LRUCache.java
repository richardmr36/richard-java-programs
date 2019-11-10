package com.myprograms.algorithms.caching;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {
    private Deque<Integer> deque = new LinkedList<>();
    private Set<Integer> table = new HashSet<>();
    private int cacheSize;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void refer(int val) {
        if(!table.contains(val)) {
            if(deque.size() == cacheSize) {
                table.remove(deque.removeLast());
            }
        }
        else {
            deque.remove(val);
        }
        deque.push(val);
        table.add(val);
    }

    public void displayTable() {
        for(int val : deque)
            System.out.print(val+ "  ");
    }

    //LRUCache as a data structure
    public int get(int val) {
        if(table.contains(val)) {
            refer(val);
            return val;
        }
        return -1;
    }

    public void set(int val) {
        refer(val);
    }
}
