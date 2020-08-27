package com.idea.shower.admin;

import com.idea.shower.db.mybaits.module.dao.AdminUserDao;
import com.idea.shower.db.mybaits.module.pojo.AdminUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.annotation.Rollback;

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
    @Autowired
    private AdminUserDao adminUserDao;

    @Test
    @WithUserDetails(value = "admin2")
    @Rollback(value = false)
    void name() {

        AdminUser adminUser = new AdminUser();
        adminUser.setUsername("yuanenzhi");
        adminUser.setPassword(passwordEncoder.encode("yuanenzhi"));
        adminUserDao.insertSelective(adminUser);
    }
}