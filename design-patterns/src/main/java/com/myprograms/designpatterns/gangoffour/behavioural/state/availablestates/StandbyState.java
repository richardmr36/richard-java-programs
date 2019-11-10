package com.myprograms.designpatterns.gangoffour.behavioural.state.availablestates;


import com.myprograms.designpatterns.gangoffour.behavioural.state.context.MP3Player;

public class StandbyState implements State {
    public void pressPlay(MP3Player context) {
        context.setState(new PlayingState());
    }
}