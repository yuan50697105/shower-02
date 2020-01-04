package org.yuan.boot.webmvc.app.configuration;

import cn.hutool.core.lang.Snowflake;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.genid.GenId;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:05
 */
@Component
@Value
public class SnowFlakeIdGeneratorGenId implements IdentifierGenerator, GenId<Long> {
    @Autowired
    private Snowflake snowflake;

    @Override
    public Number nextId(Object entity) {
        return snowflake.nextId();
    }

    @Override
    public Long genId(String table, String column) {
        return snowflake.nextId();
    }
}