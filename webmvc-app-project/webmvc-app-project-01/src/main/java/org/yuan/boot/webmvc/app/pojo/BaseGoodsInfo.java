package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: learning-demo-02
 * @description: 商品信息
 * @author: yuanez
 * @create: 2020-01-13 14:48
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class BaseGoodsInfo extends BaseEntity<BaseGoodsInfo> implements Serializable {
    private Long id;
    private String code;
    private String name;
    private BigDecimal price;
    private BigDecimal minPrice;
    private BigDecimal priceRange;
    private Integer enabled;
}
