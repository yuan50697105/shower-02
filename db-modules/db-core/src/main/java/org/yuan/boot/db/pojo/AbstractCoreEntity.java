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
public abstract class AbstractCoreEntity<T> {
    @SuppressWarnings("unchecked")
    public T copyFromByOptions(T t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        return (T) BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public T copyFromIgnoreNull(T t) {
        return copyFromByOptions(t, CopyOptions.create().ignoreNullValue());
    }

    public T copyFromIgnoreNull(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create().ignoreNullValue());
    }

    public T copyFrom(T t) {
        return copyFromByOptions(t, CopyOptions.create());
    }

    public T copyFrom(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create());
    }

}