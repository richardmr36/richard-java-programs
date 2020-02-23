package com.myprograms.concurrency.barriers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

public class PrimeNoFinder implements Callable<List<Integer>> {

    private CyclicBarrier barrier;
    private int startRange;
    private int endRange;

    public PrimeNoFinder(CyclicBarrier barrier, int startRange, int endRange) {
        this.barrier = barrier;
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public List<Integer> call() {
        List<Integer> result = findPrimeNo(startRange, endRange);
        try {
            barrier.await();
        }
        catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        return result;
    }

    private List<Integer> findPrimeNo(int startRange, int endRange) {
        List<Integer> result = new ArrayList<>();
        for (int i = startRange; i <= endRange; i++)
            if (isPrime(i))
                result.add(i);

        return result;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
