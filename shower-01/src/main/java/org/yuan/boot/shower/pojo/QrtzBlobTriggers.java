package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzBlobTriggers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzBlobTriggers implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String triggerName;

    @ApiModelProperty(value="")
    private String triggerGroup;

    @ApiModelProperty(value="")
    private byte[] blobData;

    private static final long serialVersionUID = 1L;
}