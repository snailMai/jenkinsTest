package com.example.ssmspringboot.controller;

import com.example.ssmspringboot.dao.User2Mapper;
import com.example.ssmspringboot.domain.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 博客取自https://blog.csdn.net/liboyang71/article/details/73459909
@RestController
public class User2Controller {
    //依赖注入
    @Autowired
    User2Mapper user2Mapper;

    @RequestMapping(value = "cs")
    public User2 cs() {
        //调用dao层
        User2 user2 = user2Mapper.selectUserByName("beyondLi");
        return user2;
    }
}
