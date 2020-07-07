package com.idea.shower.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 21:57
 */
@SpringBootTest(classes = ShowerAdminApplication.class)
public class ShowerAdminApplicationTests {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void name() {
        String admin1234 = passwordEncoder.encode("admin1234");
        System.out.println(admin1234);

    }
}