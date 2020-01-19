package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzSimpleTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzSimpleTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private Long repeatCount;

    @ApiModelProperty(value="")
    private Long repeatInterval;

    @ApiModelProperty(value="")
    private Long timesTriggered;

    private static final long serialVersionUID = 1L;
}