package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzJobDetails")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzJobDetails implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String jobName;

    @ApiModelProperty(value="")
    private String jobGroup;

    @ApiModelProperty(value="")
    private String description;

    @ApiModelProperty(value="")
    private String jobClassName;

    @ApiModelProperty(value="")
    private String isDurable;

    @ApiModelProperty(value="")
    private String isNonconcurrent;

    @ApiModelProperty(value="")
    private String isUpdateData;

    @ApiModelProperty(value="")
    private String requestsRecovery;

    @ApiModelProperty(value="")
    private byte[] jobData;

    private static final long serialVersionUID = 1L;
}