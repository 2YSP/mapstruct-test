package com.example.service;

import com.example.bean.User;

/**
 * Created by 2YSP on 2019/6/2.
 */
public class UserServiceImpl implements UserService {


    @Override
    public void save(User user) {
        System.out.println("==============保存user对象");
    }
}
