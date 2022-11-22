package com.laiszig.dao_repository_patterns.repository;

import com.laiszig.dao_repository_patterns.entity.User;

public interface UserRepository {

        User get(Long id);
        void add(User user);
        void update(User user);
        void remove(User user);

}
