package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzPausedTriggerGrps")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzPausedTriggerGrps implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    private static final long serialVersionUID = 1L;
}