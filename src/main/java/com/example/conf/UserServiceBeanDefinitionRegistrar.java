package com.example.conf;

import com.example.service.UserServiceImpl;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by 2YSP on 2019/6/2.
 */
public class UserServiceBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder userService = BeanDefinitionBuilder.rootBeanDefinition(UserServiceImpl.class);
        // 通过Registry就可以注入到容器里啦
        registry.registerBeanDefinition("userService",userService.getBeanDefinition());
    }
}
