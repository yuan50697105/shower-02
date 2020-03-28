package com.idea.shower.redis;

import com.idea.shower.redis.module.dao.OrderLockDao;
import com.idea.shower.redis.module.pojo.OrderLock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

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

    @Test
//    @Transactional(rollbackFor = Exception.class)
//    @Rollback(value = false)
    void tRedis() {
        OrderLockDao lockDao = context.getBean(OrderLockDao.class);
        for (int i = 0; i < 100; i++) {
            OrderLock aaa = new OrderLock((long) i, "aaa");
            lockDao.insert(aaa);

        }
        Iterable<OrderLock> lockDaoAll = lockDao.findAll();
        System.out.println("lockDaoAll = " + lockDaoAll);
    }
}