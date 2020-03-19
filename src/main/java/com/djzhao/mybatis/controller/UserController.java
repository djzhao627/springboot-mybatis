package com.djzhao.mybatis.controller;

import com.djzhao.mybatis.mapper.UserMapper;
import com.djzhao.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User控制器
 *
 * @author djzhao
 * @date 20/03/19 16:03
 * @email djzhao627@gmail.com
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    List<User> list() {
        return userMapper.list();
    }

    @GetMapping("/get/{id}")
    User getById(@PathVariable("id") int id) {
        return userMapper.getById(id);
    }

    @GetMapping("/add")
    int add(User user) {
        return userMapper.add(new User(0, "dddd", "jjjj", ""));
    }

    @GetMapping("/update")
    int update(User user) {
        return update(new User(3, "guest", "111111", ""));
    }

    @GetMapping("/delete")
    int delete(int id) {
        return delete(4);
    }
}
