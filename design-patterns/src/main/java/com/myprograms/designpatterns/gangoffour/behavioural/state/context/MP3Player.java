package com.myprograms.designpatterns.gangoffour.behavioural.state.context;

import com.myprograms.designpatterns.gangoffour.behavioural.state.availablestates.State;

public class MP3Player {
    private State state;

    public MP3Player(State state) {
        this.state = state;
    }

    public void play() {
        state.pressPlay(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("MP3 Player is now in " + state.getClass().getSimpleName());
    }
}
