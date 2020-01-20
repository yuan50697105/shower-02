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
public abstract class AbstractCoreEntity {
    @SuppressWarnings("unchecked")
    public AbstractCoreEntity copyFromByOptions(AbstractCoreEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
        return this;
    }

    @SuppressWarnings("unchecked")
    public AbstractCoreEntity copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        return BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public AbstractCoreEntity copyFromIgnoreNull(AbstractCoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create().ignoreNullValue());
    }

    public AbstractCoreEntity copyFromIgnoreNull(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create().ignoreNullValue());
    }

    public AbstractCoreEntity copyFrom(AbstractCoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create());
    }

    public AbstractCoreEntity copyFrom(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create());
    }

}