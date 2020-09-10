package com.s9abriel.service;

import com.s9abriel.dao.UserDAO;
import com.s9abriel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional //控制事务
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findNameOrPhoneCode(String name,String code) {
        return userDAO.findNameOrPhoneCode(name, code);
    }

    //修改功能
    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findOne(String id) {
        return userDAO.findOne(id);
    }

    @Override
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);

    }

}
