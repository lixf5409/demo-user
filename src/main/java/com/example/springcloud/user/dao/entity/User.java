package com.example.springcloud.user.dao.entity;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public class User {
    private String id;
    private String name;
    private String userCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }
}
