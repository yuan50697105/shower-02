package org.yuan.boot.db.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;

public interface BaseDao<T extends BaseEntity<T>, ID extends Serializable> extends IService<T> {
}
