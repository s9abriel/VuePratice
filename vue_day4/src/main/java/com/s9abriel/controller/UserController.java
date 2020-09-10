package com.s9abriel.controller;


import com.s9abriel.entity.User;
import com.s9abriel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findLike")
    public List<User> findNameOrCode(String name, String code) {
        return userService.findNameOrPhoneCode(name,code);
    }

    @GetMapping("findOne")
    public User findOne(String id) {
        return userService.findOne(id);
    }

    @GetMapping("delete")
    public Map<String, Object> delete(String id ){

        Map<String, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "用户删除失败");
        }
        return map;
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @PostMapping("/save")
    public Map<String, Object> save(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (StringUtils.isEmpty(user.getId())) {
                userService.save(user);
            }else {
                userService.update(user);
            }
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "用户保存或更新失败");
            e.printStackTrace();
        }


        return map;
    }


}
