package com.myprograms.algorithms.caching;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void refer() {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.displayTable();
    }

    @Test
    public void lruDataStructure() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(1);
        lruCache.set(2);
        Assert.assertEquals(lruCache.get(1), 1);
        lruCache.set(3);
        Assert.assertEquals(lruCache.get(2), -1); //Miss
        lruCache.set(4);
        Assert.assertEquals(lruCache.get(1), -1); //Miss
        Assert.assertEquals(lruCache.get(3), 3);
        Assert.assertEquals(lruCache.get(4), 4);
    }
}