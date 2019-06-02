package com.example.conf;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by 2YSP on 2019/6/2.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(UserServiceImportSelect.class)
public @interface EnableUserService {

    String name ();
}
