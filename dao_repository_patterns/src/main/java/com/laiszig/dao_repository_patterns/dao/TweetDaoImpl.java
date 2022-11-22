package com.laiszig.dao_repository_patterns.dao;

import com.laiszig.dao_repository_patterns.entity.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetDaoImpl implements TweetDao{

    @Override
    public List<Tweet> fetchTweets(String email) {
        List<Tweet> tweets = new ArrayList<Tweet>();
        return tweets;
    }
}
