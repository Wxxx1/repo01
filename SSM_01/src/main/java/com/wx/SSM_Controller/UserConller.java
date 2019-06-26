package com.wx.SSM_Controller;

import com.wx.SSM_Service.UserService;
import com.wx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: W_Xiao
 * @Date: 2019/6/14 15:55
 */


@RestController
@RequestMapping("/user")
public class UserConller {
    //查询所有用户
    @Resource
    private UserService userService;


    @RequestMapping(value = "sele",method = RequestMethod.GET)
    public String sele() {
        System.out.println("111111");
        List<User> list = userService.findAll();


        if (list == null) {
            return "redirect:www.baidu.com";
        } else {
            return "redirect:www.bilibili.tv";
        }



    }
}
