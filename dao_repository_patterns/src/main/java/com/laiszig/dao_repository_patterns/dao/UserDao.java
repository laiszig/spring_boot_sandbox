package com.laiszig.dao_repository_patterns.dao;

import com.laiszig.dao_repository_patterns.entity.User;

public interface UserDao {

    void create(User user);

    User read(Long id);

    void update(User user);

    void delete(String userName);
}
