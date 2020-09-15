package com.s9abriel.vue_day7.controller;


import com.s9abriel.vue_day7.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author sushibin
 * @Date 2020/9/15 6:44 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {


    @GetMapping("findAll")
    public List<User> findAll(){
        System.out.println("查询所有");
        List<User> list = Arrays.asList(
                new User("21","xiaochen",24,new Date()),
                new User("22","xiaosu",23,new Date()),
                new User("23","xiaozheng",26,new Date())

        );




        return list;
    }
}
