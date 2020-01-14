package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
public final class SysUserVo {
    @ApiModelProperty
    @NotEmpty(groups = {Update.class, ChangeRole.class}, message = "ID不能为空")
    private Long id;
    @ApiModelProperty
    @NotEmpty(groups = {Save.class, Update.class, ChangePwd.class}, message = "username不能为空")
    private String username;
    @ApiModelProperty
    @NotEmpty(groups = {Save.class}, message = "password不能为空")
    private String password;
    @ApiModelProperty
    @NotEmpty(groups = {Save.class, Update.class}, message = "realName不能为空")
    private String realName;
    @ApiModelProperty
    @NotEmpty(groups = {Save.class, Update.class}, message = "nickName不能为空")
    private String nickName;
    @ApiModelProperty
    @NotEmpty(groups = {Save.class, ChangeRole.class}, message = "roleIds不能为空")
    private List<Long> roleIds;
    @NotEmpty(groups = {ChangePwd.class})
    private String oldPwd;
    @NotEmpty(groups = {ChangePwd.class})
    private String newPwd;

    public interface Save {
    }

    public interface Update {
    }

    public interface ChangePwd {
    }

    public interface ChangeRole {
    }


}