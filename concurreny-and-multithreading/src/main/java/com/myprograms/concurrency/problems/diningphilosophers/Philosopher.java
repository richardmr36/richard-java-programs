package com.myprograms.concurrency.problems.diningphilosophers;

public class Philosopher implements Runnable {
    public final int id;
    private final Chopstick[] chopsticks;
    protected final ChopsticksOrdering chopsticksOrdering;

    public Philosopher(int id, Chopstick[] chopsticks, ChopsticksOrdering chopsticksOrdering) {
        this.id = id;
        this.chopsticks = chopsticks;
        this.chopsticksOrdering = chopsticksOrdering;
    }

    public void run() {
        while(true)
            eat();
    }

    private static void printAction(String action) {
        System.out.println(Thread.currentThread().getName() + " -> " + action);

        try {
            Thread.sleep(((int) (Math.random() * 100)));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void eat() {
        printAction("Thinking");
        ChopstickOrder chopstickOrder = this.chopsticksOrdering.getOrdering(getLeft(), getRight());
        synchronized(chopstickOrder.getLeft()) {
            printAction("Picked up left chopstick");
            synchronized(chopstickOrder.getRight()) {
                printAction("Picked up right chopstick and eating");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printAction("Put down right chopstick");
        }

        printAction("Put down left chopstick and back to thinking");
    }

    Chopstick getLeft() {  return chopsticks[id]; }
    Chopstick getRight() { return chopsticks[(id+1) % chopsticks.length]; }
}
