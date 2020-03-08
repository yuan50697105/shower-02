package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsInfoQueryBase extends BaseQueryBase {
    private Long id;
    private String code;
    private Integer type;

    public GoodsInfoQueryBase() {
    }

    public GoodsInfoQueryBase(int page, int size) {
        super(page, size);
    }

    public GoodsInfoQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}