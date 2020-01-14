package org.yuan.boot.db.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.db.pojo.AbstractBaseEntity;

import java.io.Serializable;

public interface BaseDao<T extends AbstractBaseEntity<T>, ID extends Serializable> extends IService<T> {
}
