package com.s9abriel.dao;
import com.s9abriel.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDAO {

    //根据姓名或者电话进行模糊查询
    List<User> findNameOrPhoneCode(@Param("name") String name, @Param("code") String phoneCode);

    //根据id修改某个用户
    void update(User user);

    //根据id查询某个用户
    User findOne(String id);

    //根据id删除某个用户
    void delete(String id);

    //查询所有用户
    List<User> findAll();

    //保存用户
    void save(User user);
}
