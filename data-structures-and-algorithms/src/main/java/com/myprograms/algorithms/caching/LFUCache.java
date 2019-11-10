package com.myprograms.algorithms.caching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LFUCache {
    private Set<Integer> table = new HashSet<>();
    private Map<Integer, Integer> frequencyMap = new HashMap<>();
    private Map<Integer, LinkedHashSet<Integer>> frequencyWithFifoMap = new HashMap<>();
    private int capacity;
    private int currentMinFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        frequencyWithFifoMap.put(1, new LinkedHashSet<>());
    }

    public int get(int val) {
        if (!table.contains(val))
            return -1;

        int frequency = frequencyMap.get(val);
        frequencyMap.put(val, frequency + 1);
        frequencyWithFifoMap.get(frequency).remove(val);

        // when current min does not have any data, next one would be the min
        if (frequency == currentMinFrequency && frequencyWithFifoMap.get(frequency).size() == 0)
            currentMinFrequency++;

        if (!frequencyWithFifoMap.containsKey(frequency + 1))
            frequencyWithFifoMap.put(frequency + 1, new LinkedHashSet<>());

        frequencyWithFifoMap.get(frequency + 1).add(val);
        return val;
    }

    public void set(int val) {
        if (capacity <= 0)
            return;

        if(table.contains(val)) {
            get(val);
            return;
        }

        if(table.size() >= capacity) {
            int evict = frequencyWithFifoMap.get(currentMinFrequency).iterator().next();
            frequencyWithFifoMap.get(currentMinFrequency).remove(evict);
            table.remove(evict);
        }

        table.add(val);
        frequencyMap.put(val, 1);
        currentMinFrequency = 1;
        frequencyWithFifoMap.get(1).add(val);
    }

    public void display() {
        for(int i : table)
            System.out.print(i + "  ");
    }
}
