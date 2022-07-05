package com.springsecurity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.dao.User_repository_dao;
import com.springsecurity.models.User;

@Service
public class User_service implements IUser {

    @Autowired
    private User_repository_dao user_repository;

    @Override
    public List<User> findAll() {
        return user_repository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return user_repository.findById(id).orElseThrow(null);
    }

    @Override
    public User save(User user) {
        return user_repository.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        user_repository.deleteById(id);
    }

}
