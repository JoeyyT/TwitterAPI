package com.example.admin.twitterapi.model;

/**
 * Created by admin on 23/05/2017.
 */

public class TimelineSingleton {

    private static final TimelineSingleton ourInstance = new TimelineSingleton();
    private Timeline Timeline;

    private TimelineSingleton(){
        Timeline = new Timeline();
    }

    public static TimelineSingleton getOurInstance(){
        return ourInstance;
    }
    public Timeline getTimeline(){
        return Timeline;
    }
}
