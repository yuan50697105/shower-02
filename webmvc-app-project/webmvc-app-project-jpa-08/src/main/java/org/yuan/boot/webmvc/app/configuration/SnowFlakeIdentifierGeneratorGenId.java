package org.yuan.boot.webmvc.app.configuration;

import cn.hutool.core.lang.Snowflake;
import lombok.Value;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.genid.GenId;

import java.io.Serializable;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:32
 */
@Component
@Value
public class SnowFlakeIdentifierGeneratorGenId implements IdentifierGenerator, com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator, GenId<Long> {
    private Snowflake snowflake;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return snowflake.nextId();
    }

    @Override
    public Number nextId(Object entity) {
        return snowflake.nextId();
    }

    @Override
    public Long genId(String table, String column) {
        return snowflake.nextId();
    }
}