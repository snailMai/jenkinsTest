package com.example.ssmspringboot.controller;

import com.example.ssmspringboot.dao.UserMapper;
import com.example.ssmspringboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 该教程已发表到博客
@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "pic")
    public User pic() {
        //调用dao层
        User user = userMapper.selectUserByName("wx");
        return user;
    }

    // 用来测试jenkins
    @RequestMapping(value = "jenkinstest")
    public String jenkinstest(){
//        User user = userMapper.selectUserByName("wx");
        return "helloworld, jenkins";
    }
}
