package com.laiszig.dao_repository_patterns.dao;

import com.laiszig.dao_repository_patterns.entity.Tweet;

import java.util.List;

public interface TweetDao {
    List<Tweet> fetchTweets(String email);
}
