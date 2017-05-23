package com.example.admin.twitterapi.model;

import java.util.Date;


public class Tweet {

    private String text, location, id_str;
    private int tweetId, favourite_count, retweet_count;
    private boolean favorited, retweeted;
    private Date created_at;

    public Tweet(String text, String id_str) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getId_str() {
        return id_str;
    }
}
