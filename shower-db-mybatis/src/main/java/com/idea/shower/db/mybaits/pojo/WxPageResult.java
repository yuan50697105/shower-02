package com.idea.shower.db.mybaits.pojo;

import com.github.pagehelper.PageInfo;
import com.idea.shower.db.core.pojo.IWxPageResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页结果封装
 * 微信小程序使用
 *
 * @param <T>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WxPageResult<T> extends IWxPageResult<T> {

    public WxPageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPages());
    }

    public WxPageResult(Iterable<T> list, long total, long currentPage, long totalPage) {
        super(list, total, currentPage, totalPage);
    }
}
