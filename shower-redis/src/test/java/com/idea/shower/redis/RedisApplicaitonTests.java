package com.idea.shower.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:57
 */
@SpringBootTest(classes = RedisApplicaiton.class)
public class RedisApplicaitonTests {
    @Autowired
    private ApplicationContext context;

}