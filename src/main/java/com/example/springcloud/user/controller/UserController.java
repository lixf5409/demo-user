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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/listUser")
    public String listUser(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(Integer userId) {
        User user = userService.getUser(userId);
        return JSON.toJSONString(user);
    }
}