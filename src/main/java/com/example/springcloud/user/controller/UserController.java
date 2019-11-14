package com.example.springcloud.user.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.springcloud.user.dao.entity.User;
import com.example.springcloud.user.dao.mapper.UserMapper;
import com.example.springcloud.user.service.IUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/listUser")
    public  List<User> listUser() {
        List<User> users = userService.findAll();
        return users;
    }
    @GetMapping("/getUser")
    public User getUser(Integer userId) {
        User user = userService.getUser(userId);
        return user;
    }
}