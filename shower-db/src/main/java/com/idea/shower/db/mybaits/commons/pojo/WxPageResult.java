package com.idea.shower.db.mybaits.commons.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
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
@NoArgsConstructor
@AllArgsConstructor
public class WxPageResult<T>  {

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

    public WxPageResult(PageInfo<T> pageInfo) {
        this(pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPages());
    }

    public WxPageResult(IPage<T> iPage) {
        this(iPage.getRecords(), iPage.getTotal(), iPage.getCurrent(), iPage.getPages());
    }
}
