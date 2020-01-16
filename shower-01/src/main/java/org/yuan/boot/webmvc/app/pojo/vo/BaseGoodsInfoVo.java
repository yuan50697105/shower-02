package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 15:01
 **/
@Data
public final class BaseGoodsInfoVo {
    private Long id;
    private String code;
    private String name;
    private BigDecimal price;
    private BigDecimal minPrice;
    private BigDecimal priceRange;
    private Integer enabled;

    public interface Save {
    }

    public interface Update {
    }

}
