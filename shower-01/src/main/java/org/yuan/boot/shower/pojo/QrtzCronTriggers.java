package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzCronTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzCronTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private String cronExpression;

    @ApiModelProperty(value="")
    private String timeZoneId;

    private static final long serialVersionUID = 1L;
}