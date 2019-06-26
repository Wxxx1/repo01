package com.wx.SSM_Service.SSM_ServiceImpl;

import com.wx.SSM_Dao.UserMapper;
import com.wx.SSM_Service.UserService;
import com.wx.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: W_Xiao
 * @Date: 2019/6/12 16:43
 * @descriptin:
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper up;

    @Override
    public List<User> findAll() {

        List<User> list  = up.findAll();
        return list;
    }





}
