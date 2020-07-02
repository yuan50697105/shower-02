package com.idea.shower.admin.admin.command.annotation;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 19:23
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Indexed
public @interface RouteUrl {
    String value() default "";
}