package com.myprograms.algorithms.caching;

import static org.junit.Assert.*;

import org.junit.Test;

public class LFUCacheTest {

    @Test
    public void testCaching() {
        LFUCache lfuCache = new LFUCache(4);
        lfuCache.set(1);
        lfuCache.set(2);
        lfuCache.set(1);
        lfuCache.set(3);
        lfuCache.set(2);
        lfuCache.set(4);
        lfuCache.set(5);

        lfuCache.display();
    }
}