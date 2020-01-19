package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzSimpropTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzSimpropTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private String strProp1;

    @ApiModelProperty(value="")
    private String strProp2;

    @ApiModelProperty(value="")
    private String strProp3;

    @ApiModelProperty(value="")
    private Integer intProp1;

    @ApiModelProperty(value="")
    private Integer intProp2;

    @ApiModelProperty(value="")
    private Long longProp1;

    @ApiModelProperty(value="")
    private Long longProp2;

    @ApiModelProperty(value="")
    private BigDecimal decProp1;

    @ApiModelProperty(value="")
    private BigDecimal decProp2;

    @ApiModelProperty(value="")
    private String boolProp1;

    @ApiModelProperty(value="")
    private String boolProp2;

    private static final long serialVersionUID = 1L;
}