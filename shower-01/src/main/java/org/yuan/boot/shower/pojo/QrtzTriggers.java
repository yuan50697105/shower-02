package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private String jobName;

    @ApiModelProperty(value="")
    private String jobGroup;

    @ApiModelProperty(value="")
    private String description;

    @ApiModelProperty(value="")
    private Long nextFireTime;

    @ApiModelProperty(value="")
    private Long prevFireTime;

    @ApiModelProperty(value="")
    private Integer priority;

    @ApiModelProperty(value="")
    private String triggerState;

    @ApiModelProperty(value="")
    private String triggerType;

    @ApiModelProperty(value="")
    private Long startTime;

    @ApiModelProperty(value="")
    private Long endTime;

    @ApiModelProperty(value="")
    private String calendarName;

    @ApiModelProperty(value="")
    private Short misfireInstr;

    @ApiModelProperty(value="")
    private byte[] jobData;

    private static final long serialVersionUID = 1L;
}