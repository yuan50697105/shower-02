package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="org-yuan-boot-shower-pojo-SysModule")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysModule implements Serializable {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    private Long id;

    /**
    * name
    */
    @ApiModelProperty(value="name")
    private String name;

    /**
    * content
    */
    @ApiModelProperty(value="content")
    private String content;

    /**
    * type
    */
    @ApiModelProperty(value="type")
    private String type;

    /**
    * parentId
    */
    @ApiModelProperty(value="parentId")
    private Long parentId;

    /**
    * level
    */
    @ApiModelProperty(value="level")
    private Integer level;

    private static final long serialVersionUID = 1L;
}