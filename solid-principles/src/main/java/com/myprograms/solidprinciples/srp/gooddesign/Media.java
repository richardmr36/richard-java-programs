package com.myprograms.solidprinciples.srp.gooddesign;

public abstract class Media {
    private int duration;
    private String name;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeTo(IWriter writer) {
        writer.saveTo(name);
    }

    public abstract void printInfo();
}
