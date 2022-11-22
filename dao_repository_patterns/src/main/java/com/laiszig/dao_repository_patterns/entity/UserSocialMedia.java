package com.laiszig.dao_repository_patterns.entity;

import java.util.List;

public class UserSocialMedia extends User{

    private List<Tweet> tweets;

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}
