package com.wx.SSM_Service;
import com.wx.domain.User;

import java.util.List;

/**
 * @Author: W_Xiao
 * @Date: 2019/6/12 16:41
 */


public interface UserService {
    List<User> findAll();
}
