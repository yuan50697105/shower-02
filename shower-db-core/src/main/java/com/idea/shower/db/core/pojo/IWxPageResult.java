package com.idea.shower.db.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页结果封装
 * 微信小程序使用
 *
 * @param <T>
 */
@Data
public abstract class IWxPageResult<T> {
    /**
     * 数据列表
     */
    private Iterable<T> list;
    /**
     * 总记录数量
     */
    private long total;
    /**
     * 当前页码
     */
    private long currentPage;
    /**
     * 总页数
     */
    private long totalPage;

    public IWxPageResult() {
    }

    public IWxPageResult(Iterable<T> list, long total, long currentPage, long totalPage) {
        this.list = list;
        this.total = total;
        this.currentPage = currentPage;
        this.totalPage = totalPage;
    }
}
