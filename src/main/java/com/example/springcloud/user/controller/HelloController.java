package com.example.springcloud.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        return "hello spring boot";
    }

}