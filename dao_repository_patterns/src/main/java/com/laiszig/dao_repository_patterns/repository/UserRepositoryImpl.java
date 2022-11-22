package com.laiszig.dao_repository_patterns.repository;

import com.laiszig.dao_repository_patterns.dao.TweetDaoImpl;
import com.laiszig.dao_repository_patterns.dao.UserDaoImpl;
import com.laiszig.dao_repository_patterns.entity.Tweet;
import com.laiszig.dao_repository_patterns.entity.User;
import com.laiszig.dao_repository_patterns.entity.UserSocialMedia;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private UserDaoImpl userDaoImpl;
    private TweetDaoImpl tweetDaoImpl;

    @Override
    public User get(Long id) {
        UserSocialMedia user = (UserSocialMedia) userDaoImpl.read(id);

        List<Tweet> tweets = tweetDaoImpl.fetchTweets(user.getEmail());
        user.setTweets(tweets);

        return user;
    }

    @Override
    public void add(User user) {
        userDaoImpl.create(user);
    }

    @Override
    public void update(User user) {
        userDaoImpl.update(user);
    }

    @Override
    public void remove(User user) {
        userDaoImpl.delete(user.getUserName());
    }
}
