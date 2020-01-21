package org.yuan.boot.db.pojo;

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
public abstract class CoreEntity {
    @SuppressWarnings("unchecked")
    public CoreEntity copyFromByOptions(CoreEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
        return this;
    }

    @SuppressWarnings("unchecked")
    public CoreEntity copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        return BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public CoreEntity copyFromIgnoreNull(CoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create().ignoreNullValue());
    }

    public CoreEntity copyFromIgnoreNull(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create().ignoreNullValue());
    }

    public CoreEntity copyFrom(CoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create());
    }

    public CoreEntity copyFrom(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create());
    }

}