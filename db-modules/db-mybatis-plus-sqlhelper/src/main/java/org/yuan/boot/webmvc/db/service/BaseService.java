package org.yuan.boot.webmvc.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.webmvc.db.pojo.BaseEntity;

public interface BaseService<T extends BaseEntity<T>> extends IService<T> {
}
