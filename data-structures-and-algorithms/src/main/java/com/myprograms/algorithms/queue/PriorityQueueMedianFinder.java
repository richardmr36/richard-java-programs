package com.myprograms.algorithms.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMedianFinder {
    public double[] getMedians(int[] array) {
        PriorityQueue<Integer> lowers = new PriorityQueue<>((o1, o2) -> -1 * o1.compareTo(o2));
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }
        return medians;
    }

    private double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double) biggerHeap.peek() + smallerHeap.peek()) / 2;
        }
        else {
            return biggerHeap.peek();
        }
    }

    private void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if (biggerHeap.size() - smallerHeap.size() > 1) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        }
        else {
            highers.add(number);
        }
    }


    public double[] getMediansSimpler(int[] array) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        double[] result = new double[array.length];
        int i = 0;
        for(int val : array) {
            addSimpler(val, minHeap, maxHeap);
            result[i++] = findMedianSimpler(minHeap, maxHeap);
        }

        return result;

    }

    private double findMedianSimpler(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if(maxHeap.size() == minHeap.size())
            return ((double) (maxHeap.peek() + minHeap.peek()) / 2);

        return maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
    }

    private void addSimpler(int val, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        minHeap.add(val);
        if(minHeap.size() - maxHeap.size() > 1)
            maxHeap.add(minHeap.remove());
    }


}
