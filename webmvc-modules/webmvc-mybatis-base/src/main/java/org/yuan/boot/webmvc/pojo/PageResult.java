package org.yuan.boot.webmvc.pojo;


import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends PageCollectionResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(int code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }
}
