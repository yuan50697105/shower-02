package org.yuan.boot.webmvc.app.repository;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:36
 */
@NoRepositoryBean
public interface BaseRepository<T> extends org.yuan.boot.db.repository.BaseRepository<T,Long> {
}
