package com.springsecurity.Services;

import java.util.List;

import com.springsecurity.models.User;

public interface IUser {

    public List<User> findAll();

    public User findById(Integer id);

    public User save(User user);

    public void deleteById(Integer id);

}
