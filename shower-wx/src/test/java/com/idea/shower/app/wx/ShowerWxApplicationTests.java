package com.idea.shower.app.wx;

import com.idea.shower.app.db.module.mapper.CustomerInfoMapper;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import com.idea.shower.app.db.module.pojo.CustomerInfoExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ShowerWxApplication.class)
public class ShowerWxApplicationTests {
    @Autowired
    private ApplicationContext context;

    @Test
    void t1() {
        CustomerInfoMapper customerInfoMapper = context.getBean(CustomerInfoMapper.class);
        long count = customerInfoMapper.countByExample(new CustomerInfoExample());
        System.out.println("count = " + count);
    }

    @Test
    @Transactional
    @Rollback(false)
    void t2() {
        CustomerInfoMapper customerInfoMapper = context.getBean(CustomerInfoMapper.class);
        int insert = customerInfoMapper.insert(new CustomerInfo());
        System.out.println("insert = " + insert);
    }
}
