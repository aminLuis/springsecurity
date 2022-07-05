package com.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.models.User;

public interface User_repository_dao extends JpaRepository<User, Integer> {

}
