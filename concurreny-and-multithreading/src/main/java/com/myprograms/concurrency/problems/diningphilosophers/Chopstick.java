package com.myprograms.concurrency.problems.diningphilosophers;

import java.util.Objects;

public class Chopstick {
    private final int id;

    public int getId() {
        return id;
    }

    public Chopstick(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chopstick chopstick = (Chopstick) o;
        return id == chopstick.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
