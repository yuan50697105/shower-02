package org.yuan.boot.webmvc.db.core.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

@Data
public class BaseCoreEntity<T> {


    @SuppressWarnings("unchecked")
    public T copyFrom(T t, String... ignore) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignore));
        return (T) this;
    }

    public T copyFrom(T t) {
        return copyFrom(t, "id");
    }

    @SuppressWarnings("unchecked")
    public T copyFromWithNull(T t, String... ignore) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().setIgnoreProperties(ignore));
        return (T) this;
    }

    public T copyFromWithNull(T t) {
        return copyFromWithNull(t, "id");
    }
}
