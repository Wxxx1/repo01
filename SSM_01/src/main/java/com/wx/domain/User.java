package com.wx.domain;

import java.util.Date;

/**
 * @Author: W_Xiao
 * @Date: 2019/6/12 16:01
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date registday;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return registday;
    }

    public void setBirthday(Date birthday) {
        this.registday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + registday +
                '}';
    }
}

