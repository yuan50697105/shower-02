package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-QrtzCalendars")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QrtzCalendars implements Serializable {
    @ApiModelProperty(value="")
    private String schedName;

    @ApiModelProperty(value="")
    private String calendarName;

    @ApiModelProperty(value="")
    private byte[] calendar;

    private static final long serialVersionUID = 1L;
}