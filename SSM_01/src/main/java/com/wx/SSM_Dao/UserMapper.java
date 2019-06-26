package com.wx.SSM_Dao;

import com.wx.domain.User;

import java.util.List;

/**
 * @Author: W_Xiao
 * @Date: 2019/6/12 16:37
 */
public interface UserMapper {


    List<User> findAll();

}
