package com.myprograms.designpatterns.gangoffour.behavioural.state;

import com.myprograms.designpatterns.gangoffour.behavioural.state.availablestates.PlayingState;
import com.myprograms.designpatterns.gangoffour.behavioural.state.availablestates.StandbyState;
import com.myprograms.designpatterns.gangoffour.behavioural.state.context.MP3Player;

public class StateApp {
    public static void main(String[] args) {
        MP3Player mp3PlayerContext = new MP3Player(new StandbyState());
        mp3PlayerContext.play();

        mp3PlayerContext.play();

        mp3PlayerContext.setState(new PlayingState());
    }
}
