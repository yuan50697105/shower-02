package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:26
 */
@ApiModel
@Data
public class SysUserVo {
    @ApiModelProperty
    private Long id;
    @ApiModelProperty
    private String username;
    @ApiModelProperty
    private String password;
    @ApiModelProperty
    private String realName;
    @ApiModelProperty
    private String nickName;
}