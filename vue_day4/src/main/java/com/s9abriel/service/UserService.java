package com.s9abriel.service;

import com.s9abriel.entity.User;

import java.util.List;


public interface UserService {

    List<User> findNameOrPhoneCode(String name,String code);

    void update(User user);

    User findOne(String id);

    void delete(String id);

    List<User> findAll();

    void save(User user);
}
