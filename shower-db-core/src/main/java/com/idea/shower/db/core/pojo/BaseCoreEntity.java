package com.idea.shower.db.core.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.util.Map;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:13
 */
@Data
public abstract class BaseCoreEntity {
    public BaseCoreEntity copyFromByOptions(BaseCoreEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
        return this;
    }

    public BaseCoreEntity copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        return BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public BaseCoreEntity copyFrom(BaseCoreEntity t, String... ignoreProperties) {
        return copyFromByOptions(t, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public BaseCoreEntity copyFrom(Map<?, ?> map, String... ignoreProperties) {
        return copyFromByOptions(map, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }


}