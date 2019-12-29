package org.yuan.boot.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseDbService;

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDbService<T> {
}
