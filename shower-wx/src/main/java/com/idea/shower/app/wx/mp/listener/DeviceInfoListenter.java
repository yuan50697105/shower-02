package com.idea.shower.app.wx.mp.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-05 14:00
 */
@Order(Integer.MAX_VALUE)
@Component
@Slf4j
public class DeviceInfoListenter implements CommandLineRunner, ApplicationRunner {
    public void init() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}