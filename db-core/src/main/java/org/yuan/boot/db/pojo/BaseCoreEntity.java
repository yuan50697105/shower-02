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
public abstract class BaseCoreEntity {
    public BaseCoreEntity copyFromByOptions(BaseCoreEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
        return this;
    }

    public BaseCoreEntity copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        return BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public BaseCoreEntity copyFromIgnoreNull(BaseCoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create().ignoreNullValue());
    }

    public BaseCoreEntity copyFromIgnoreNull(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create().ignoreNullValue());
    }

    public BaseCoreEntity copyFrom(BaseCoreEntity t) {
        return copyFromByOptions(t, CopyOptions.create());
    }

    public BaseCoreEntity copyFrom(Map<?, ?> map) {
        return copyFromByOptions(map, CopyOptions.create());
    }

}