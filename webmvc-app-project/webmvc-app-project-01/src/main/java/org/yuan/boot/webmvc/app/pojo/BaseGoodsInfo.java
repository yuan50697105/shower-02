package org.yuan.boot.webmvc.app.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseGoodsInfo extends BaseEntity<BaseGoodsInfo> implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * createUser
     */
    private String createUser;

    /**
     * updateUser
     */
    private String updateUser;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * price
     */
    private BigDecimal price;

    /**
     * minPrice
     */
    private BigDecimal minPrice;

    /**
     * priceRange
     */
    private BigDecimal priceRange;

    /**
     * enabled
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;

}