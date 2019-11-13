package com.example.springcloud.user.service;

import com.example.springcloud.user.dao.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IUserService {
    List<User> findAll();
    User getUser(@Param("userId") Integer userId);
}
