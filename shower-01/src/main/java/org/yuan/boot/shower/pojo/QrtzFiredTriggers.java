package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzFiredTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzFiredTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String entryId;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private String instanceName;

    @ApiModelProperty(value="")
    private Long firedTime;

    @ApiModelProperty(value="")
    private Long schedTime;

    @ApiModelProperty(value="")
    private Integer priority;

    @ApiModelProperty(value="")
    private String state;

    @ApiModelProperty(value="")
    private String jobName;

    @ApiModelProperty(value="")
    private String jobGroup;

    @ApiModelProperty(value="")
    private String isNonconcurrent;

    @ApiModelProperty(value="")
    private String requestsRecovery;

    private static final long serialVersionUID = 1L;
}