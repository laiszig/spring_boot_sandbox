package com.laiszig.dao_repository_patterns.dao;

import com.laiszig.dao_repository_patterns.entity.User;

import javax.persistence.EntityManager;

public class UserDaoImpl implements UserDao{

    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public User read(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {
        entityManager.refresh(user);

    }

    @Override
    public void delete(String userName) {
        entityManager.remove(userName);
    }
}
