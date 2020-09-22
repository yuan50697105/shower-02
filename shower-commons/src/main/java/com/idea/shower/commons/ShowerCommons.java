package com.idea.shower.commons;

import com.idea.shower.commons.storage.StoreConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-12 20:44
 */
@Configuration
@Import(StoreConfiguration.class)
@ComponentScan
public class ShowerCommons {
}