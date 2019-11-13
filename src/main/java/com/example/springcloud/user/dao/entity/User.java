package com.example.springcloud.user.dao.entity;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public class User {
    private String userId;
    private String userName;
    private String userCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }
}
