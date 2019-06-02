package com.example;

import com.example.bean.User;
import com.example.conf.Config;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 2YSP on 2019/6/2.
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserServiceImpl.class);
        User user = new User();
        user.setId(1);
        user.setName("fdaf");
        userService.save(user);
        context.close();
    }
}
