package com.laiszig.dao_repository_patterns.repository;

import com.laiszig.dao_repository_patterns.dao.UserDaoImpl;
import com.laiszig.dao_repository_patterns.entity.User;

public class UserRepositoryImpl implements UserRepository{
    private UserDaoImpl userDaoImpl;

    @Override
    public User get(Long id) {
        User user = userDaoImpl.read(id);
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
