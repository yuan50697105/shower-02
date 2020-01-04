package org.yuan.boot.webmvc.app.configuration;

import cn.hutool.core.lang.Snowflake;
import lombok.Value;
import tk.mybatis.mapper.genid.GenId;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:58
 */
@Value
public class SnowFlakGenId implements GenId<Long> {
    private Snowflake snowflake;

    @Override
    public Long genId(String table, String column) {
        return snowflake.nextId();
    }
}