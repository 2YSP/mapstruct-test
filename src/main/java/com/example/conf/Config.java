package com.example.conf;

import com.example.service.UserServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by 2YSP on 2019/6/2.
 */
@Configuration
//@Import(value = UserServiceImpl.class)
//@Import(value = UserServiceBeanDefinitionRegistrar.class)
@EnableUserService(name = "ship_test")
public class Config {
}
