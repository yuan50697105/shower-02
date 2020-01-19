package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-BaseGoodsInfo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseGoodsInfo implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * createUser
     */
    @ApiModelProperty(value = "createUser")
    private String createUser;

    /**
     * updateUser
     */
    @ApiModelProperty(value = "updateUser")
    private String updateUser;

    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

    /**
     * updateTime
     */
    @ApiModelProperty(value = "updateTime")
    private Date updateTime;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;

    /**
     * minPrice
     */
    @ApiModelProperty(value = "minPrice")
    private BigDecimal minPrice;

    /**
     * priceRange
     */
    @ApiModelProperty(value = "priceRange")
    private BigDecimal priceRange;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

    private static final long serialVersionUID = 1L;

    public static BaseGoodsInfoBuilder builder() {
        return new BaseGoodsInfoBuilder();
    }
}