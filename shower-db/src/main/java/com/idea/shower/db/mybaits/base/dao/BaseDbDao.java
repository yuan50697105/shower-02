package com.idea.shower.db.mybaits.base.dao;

import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

public interface BaseDbDao<T, ID extends Serializable> extends IService<T> {
}
