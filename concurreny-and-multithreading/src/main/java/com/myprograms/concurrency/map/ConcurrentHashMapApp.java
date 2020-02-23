package com.myprograms.concurrency.map;

import java.net.URISyntaxException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApp {
    public static void main(String[] args) throws URISyntaxException {
        ConcurrentHashMap<Actor, Set<Movie>> map = new ConcurrentHashMap<>();
        MovieReader reader = new MovieReader();
        reader.addActorsToMap(map);
        System.out.println("Total no of actors = " + map.size());

        Integer maxMoviesForAnActor = map.reduce(10, (actor, movies) -> movies.size(), Integer::max);
        System.out.println("Max no of movies for an actor = " + maxMoviesForAnActor);

        Actor welker = map.search(10, (actor, movies) -> actor.lastName().equals("Welker") ? actor : null);
        System.out.println("Actor with last name Welker = " + welker);

        int totalNoOfMovies = map.reduce(10, (actor, movies) -> movies.size(), Integer::sum);
        System.out.println("Average movies per actor = " + totalNoOfMovies / map.size());
    }
}
