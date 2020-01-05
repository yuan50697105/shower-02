package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.yuan.boot.webmvc.app.pojo.validate.SaveOrUpdateValidate;
import org.yuan.boot.webmvc.app.pojo.validate.SaveValidate;

import javax.validation.constraints.NotEmpty;
import java.util.List;

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
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String username;
    @ApiModelProperty
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String password;
    @ApiModelProperty
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String realName;
    @ApiModelProperty
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String nickName;
    @ApiModelProperty
    @NotEmpty(groups = SaveValidate.class)
    private List<Long> roleIds;

}