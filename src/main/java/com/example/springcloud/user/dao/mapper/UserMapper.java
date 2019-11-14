package com.example.springcloud.user.dao.mapper;

import com.example.springcloud.user.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
@Mapper()
@Repository("userMapper")
public interface UserMapper {

//    @Select("SELECT user_id as userId,user_code as userCode ,user_name as userName FROM org_user ")
    List<User> findAll();
//    @Select("SELECT user_id as userId,user_code as userCode ,user_name as userName FROM org_user where user_id=#{userId}")
    User getUser(Integer userId);
}
