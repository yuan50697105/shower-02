package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzSchedulerState")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzSchedulerState implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String instanceName;

    @ApiModelProperty(value="")
    private Long lastCheckinTime;

    @ApiModelProperty(value="")
    private Long checkinInterval;

    private static final long serialVersionUID = 1L;
}